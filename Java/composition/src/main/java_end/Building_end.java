import java.util.ArrayList;

public class Building_end {
    private ArrayList<Room_end> rooms;

    public Building_end(ArrayList<Room_end> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Room_end> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room_end> rooms) {
        this.rooms = rooms;
    }

    public int getTotalSquareFootage() {
        int currentSquareFootage = 0;
        for (Room_end room: rooms) {
            currentSquareFootage += room.getSquareFootage();
        }
        return currentSquareFootage;
    }
}
