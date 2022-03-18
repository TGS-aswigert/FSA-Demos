public class HomeTheatre_end {
    private final SurroundSoundSystem surroundSoundSystem;
    private final Projector projector;
    private final Lights lights;
    private final PopcornPopper popcornPopper;
    private final Screen screen;
    private final StreamingPlayer streamingPlayer;

    public HomeTheatre_end(SurroundSoundSystem surroundSoundSystem,
                       Projector projector,
                       Lights lights,
                       PopcornPopper popcornPopper,
                       Screen screen,
                       StreamingPlayer streamingPlayer) {
        this.surroundSoundSystem = surroundSoundSystem;
        this.projector = projector;
        this.lights = lights;
        this.popcornPopper = popcornPopper;
        this.screen = screen;
        this.streamingPlayer = streamingPlayer;
    }

    public void watchMovie(String movieTitle) {
        popcornPopper.on();
        popcornPopper.pop();
        screen.down();
        lights.dim(10);
        projector.on();
        projector.wideScreenMode();
        surroundSoundSystem.on();
        surroundSoundSystem.setVolume(40);
        streamingPlayer.on();
        streamingPlayer.play(movieTitle);
    }

    public void endMovie() {
        popcornPopper.off();
        lights.on();
        streamingPlayer.stop();
        streamingPlayer.off();
        surroundSoundSystem.off();
        projector.off();
        screen.up();
    }
}
