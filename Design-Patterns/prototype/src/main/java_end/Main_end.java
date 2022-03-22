import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Creature_end> creatures = new ArrayList<>();
        Creature_end zombie = new Zombie_end();
        creatures.add(zombie);

        try {
            creatures.add(zombie.clone());
            creatures.add(zombie.clone());
        } catch (CloneNotSupportedException exception) {
            System.out.println(exception.getMessage());
        }

        zombie.takeDamage();

        try {
            creatures.add(zombie.clone());
            creatures.add(zombie.clone());
        } catch (CloneNotSupportedException exception) {
            System.out.println(exception.getMessage());
        }

        for (Creature_end creature :
                creatures) {
            System.out.println(creature.health);
        }
    }
}
