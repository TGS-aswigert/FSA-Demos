public class PopcornPopper {
    private final String location;

    public PopcornPopper(String location) {
        this.location = location;
    }

    public void pop() {
        System.out.println(this.location + " popcorn popper is popping");
    }

    public void stopPopping() {
        System.out.println(this.location + " popcorn popper has stopped popping");
    }
}
