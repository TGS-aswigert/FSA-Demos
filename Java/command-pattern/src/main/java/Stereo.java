public class Stereo {
    private final String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + " stereo is on");
    }

    public void off() {
        System.out.println(this.location + " stereo is off");
    }

    public void setCD() {
        System.out.println(this.location + " stereo is set of CD input");
    }

    public void setRadio() {
        System.out.println(this.location + " stereo is set of radio input");
    }

    public void setVolume(int volume) {
        System.out.println(this.location + " stereo volume is set to " + volume);
    }
}
