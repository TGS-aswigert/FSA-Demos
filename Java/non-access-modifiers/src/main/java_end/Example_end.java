public abstract class Example_end {
    final String name = "example class";
    static int count = 0;

    public Example_end() {
//        this.name = "new example";
        count++;
    }

    final String getName() {
        return name;
    }

    static void resetCount() {
        count = 0;
    }

    abstract void printCount();
}