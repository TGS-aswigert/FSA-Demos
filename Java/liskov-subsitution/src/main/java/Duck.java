public class Duck implements Bird {

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void walk() {
        System.out.println("Duck is walking");
    }

    @Override
    public void layEggs() {
        System.out.println("Duck is laying eggs");
    }
}
