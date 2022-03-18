public class StreamingPlayer {
    public void on() {
        System.out.println("Streaming Player on");
    }

    public void off() {
        System.out.println("Streaming Player off");
    }

    public void play(String movieTitle) {
        System.out.println("Streaming Player playing \"" + movieTitle + "\"");
    }

    public void pause(String movieTitle) {
        System.out.println("Paused \"" + movieTitle + "\"");
    }

    public void stop() {
        System.out.println("Streaming Player stopped");
    }
}
