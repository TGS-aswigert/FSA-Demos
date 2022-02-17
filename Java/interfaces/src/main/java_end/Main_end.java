public class Main_end {
    public static void main(String[] args) {
//        Animal_end animal = new Animal_end(); This does not work because interfaces cannot be instantiated

        Dog_end dog = new Dog_end();
        Animal_end pig = new Pig_end();

        dog.makeAnimalSound();
        dog.eat();
        dog.run();

        pig.makeAnimalSound();
        pig.eat();
        pig.run();
    }
}
