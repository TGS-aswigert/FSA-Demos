public class Main_end {
    public static void main(String[] args) {
        Example_end ex = new ExampleChild_end();
        Example_end ex2 = new ExampleChild_end();
        Example_end ex3 = new ExampleChild_end();
        ex.printCount();
        Example_end.resetCount();
        ex.printCount();
    }
}
