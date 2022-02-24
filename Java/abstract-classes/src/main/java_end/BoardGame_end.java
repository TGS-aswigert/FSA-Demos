import java.util.ArrayList;

public abstract class BoardGame_end {
    int boardHeightInInches;
    int boardWidthInInches;
    ArrayList<String> gamePieces;

    public BoardGame_end(int boardHeightInInches, int boardWidthInInches, ArrayList<String> gamePieces) {
        this.boardHeightInInches = boardHeightInInches;
        this.boardWidthInInches = boardWidthInInches;
        this.gamePieces = gamePieces;
    }

    public int getBoardHeightInInches() {
        return boardHeightInInches;
    }

    public int getBoardWidthInInches() {
        return boardWidthInInches;
    }

    public ArrayList<String> getGamePieces() {
        return gamePieces;
    }

    public void setGamePieces(ArrayList<String> gamePieces) {
        this.gamePieces = gamePieces;
    }

    public void placeGameBoard() {
        System.out.println("The " + getBoardHeightInInches() + "x" + getBoardWidthInInches() +
                "in game board has been placed on the table.");
    };

    public abstract void setUp();

    public abstract void play();
}
