public abstract class Creature_end implements Cloneable{
    public int health = 10;

    public Creature_end clone() throws CloneNotSupportedException {
        return (Creature_end) super.clone();
    }

    public void takeDamage() {
        health -= 3;
    }
}
