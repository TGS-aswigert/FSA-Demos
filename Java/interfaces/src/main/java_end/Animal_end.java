public interface Animal_end {
    public void makeAnimalSound();

    public default void run() {
        System.out.println("The animal runs");
    }

    public default void eat() {
        System.out.println("The animal eats");
    };
}
