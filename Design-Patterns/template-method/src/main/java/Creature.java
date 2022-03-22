public abstract class Creature {
    private int healthPoints;
    private final int attackPoints;

    public Creature(int healthPoints, int attackPoints) {
        this.healthPoints = healthPoints;
        this.attackPoints = attackPoints;
    }

    public void attack(Creature enemy) {
        enemy.healthPoints -= this.attackPoints;
        if(enemy.healthPoints <= 0) {
            System.out.println("the enemy head unit died!");
        } else {
            System.out.println("the enemy head unit's health is now " + enemy.getHealthPoints());
        }
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }
}
