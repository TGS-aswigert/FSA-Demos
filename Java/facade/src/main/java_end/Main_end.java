public class Main {
    public static void main(String[] args) {
        Lights lights = new Lights();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();
        StreamingPlayer streamingPlayer = new StreamingPlayer();
        SurroundSoundSystem surroundSoundSystem = new SurroundSoundSystem();
        HomeTheatre_end homeTheatre = new HomeTheatre_end(surroundSoundSystem, projector, lights,
                popcornPopper, screen, streamingPlayer);

        homeTheatre.watchMovie("Dune");
        homeTheatre.endMovie();
    }
}
