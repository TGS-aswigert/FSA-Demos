public class MagicMazeGame_end extends MazeGame_end {
    @Override
    protected Room_end makeRoom() {
        return new MagicRoom_end();
    }
}
