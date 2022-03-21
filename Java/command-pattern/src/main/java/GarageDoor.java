public class GarageDoor {
    private final String location;
    private final Light light;

    public GarageDoor(String location) {
        this.location = location;
        this.light = new Light("Garage");
    }

    public void up() {
        this.light.on();
        System.out.println(this.location + " door is going up");
    }

    public void down() {
        System.out.println(this.location + " door is going down");
        this.light.off();
    }
}
