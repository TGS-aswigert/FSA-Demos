import java.util.ArrayList;

public class Sorry_end extends BoardGame_end {

    public Sorry_end() {
        super(10, 10, new ArrayList<>());
    }

    private ArrayList<String> createPawns() {
        ArrayList<String> pawns = new ArrayList<>();
        for (int i= 1; i <= 4 ; i++) {
            pawns.add("Red Pawn");
        }
        for (int i= 1; i <= 4 ; i++) {
            pawns.add("Green Pawn");
        }
        for (int i= 1; i <= 4 ; i++) {
            pawns.add("Yellow Pawn");
        }
        for (int i= 1; i <= 4 ; i++) {
            pawns.add("Blue Pawn");
        }

        return pawns;
    }

    @Override
    public void setUp() {
        this.setGamePieces(createPawns());
        System.out.println("Players have picked their pawn colors and placed all 4 in the designated start space.");
        System.out.println("The deck has been shuffled and placed in the designated spot.");
    }

    @Override
    public void play() {
        System.out.println("2-4 players are playing Sorry!");
    }
}
