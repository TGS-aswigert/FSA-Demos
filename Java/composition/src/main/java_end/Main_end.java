import java.util.ArrayList;

public class Main_end {
    public static void main(String[] args) {

        ArrayList<Room_end> rooms = new ArrayList<>();

        Room_end bedroom = new Room_end(375, "blue");
        Room_end office = new Room_end(150, "white");
        Room_end livingRoom = new Room_end(250, "white");

        rooms.add(bedroom);
        rooms.add(office);
        rooms.add(livingRoom);

        Building_end building = new Building_end(rooms);

        System.out.println(building.getTotalSquareFootage());
    }
}
