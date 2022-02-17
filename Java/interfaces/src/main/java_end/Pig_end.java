public class Pig_end implements Animal_end {

    @Override
    public void makeAnimalSound() {
        System.out.println("Oink!");
    }

    @Override
    public void run() {
        System.out.println("The pig waddles quickly");
    }

    @Override
    public void eat() {
        System.out.println("The pig eats anything in its trough");
    }
}
