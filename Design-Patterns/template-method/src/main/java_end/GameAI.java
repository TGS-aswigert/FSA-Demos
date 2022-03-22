import java.util.ArrayList;

public abstract class GameAI {
    private ArrayList<String> structures = new ArrayList<>();
    private ArrayList<String> resources = new ArrayList<>();
    private ArrayList<Creature> units = new ArrayList<>();

    public void takeTurn(GameAI enemy) {
        collectResources();
        buildStructures();
        buildUnits();
        attack(enemy);
    }

    public abstract void buildStructures();
    public abstract void buildUnits();
    public abstract void collectResources();

    public void attack(GameAI enemy) {
        if (enemy.units.size() > 0) {
            Creature headUnit = this.units.get(0);
            Creature enemyHeadUnit = enemy.units.get(0);
            headUnit.attack(enemyHeadUnit);
            if (enemyHeadUnit.getHealthPoints() <= 0) {
                enemy.units.remove(0);
            }
            System.out.println(headUnit + " attacked " + enemyHeadUnit);
        } else {
            System.out.println("there are no enemies to attack");
        }
    }


    public ArrayList<String> getStructures() {
        return structures;
    }

    public ArrayList<String> getResources() {
        return resources;
    }

    public ArrayList<Creature> getUnits() {
        return units;
    }

}
