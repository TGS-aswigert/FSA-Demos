import java.util.ArrayList;

public class Checkers_end extends BoardGame_end {

    public Checkers_end() {
        super(8, 8, new ArrayList<>());
    }

    private ArrayList<String> createDiscs() {
        ArrayList<String> discs = new ArrayList<>();

        for (int i = 1; i <= 12 ; i++) {
            discs.add("Red Disc");
        }
        for (int i = 1; i <= 12 ; i++) {
            discs.add("Black Disc");
        }

        return discs;
    }

    @Override
    public void setUp() {
        this.setGamePieces(createDiscs());
        System.out.println("Red and Black discs have been placed on the board");
    }

    @Override
    public void play() {
        System.out.println("2 players are playing Checkers!");
    }
}
