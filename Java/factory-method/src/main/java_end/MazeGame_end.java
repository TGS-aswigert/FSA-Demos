import java.util.ArrayList;
import java.util.List;

public abstract class MazeGame_end {
    private final List<Room_end> rooms = new ArrayList<>();

    public MazeGame() {
        Room_end room1 = makeRoom();
        Room_end room2 = makeRoom();
        room1.connect(room2);
        rooms.add(room1);
        rooms.add(room2);
    }

    abstract protected Room_end makeRoom();
}
