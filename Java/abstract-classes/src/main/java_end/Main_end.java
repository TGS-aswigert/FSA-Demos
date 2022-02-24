public class Main_end {
    public static void main(String[] args) {
        Checkers_end checkers = new Checkers_end();
        Sorry_end sorry = new Sorry_end();

        checkers.placeGameBoard();
        checkers.setUp();
        checkers.play();

        sorry.placeGameBoard();
        sorry.setUp();
        sorry.play();
    }
}