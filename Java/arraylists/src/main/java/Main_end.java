import java.util.ArrayList;
import java.util.Iterator;

public class Main_end {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
//        System.out.println(names.size());

        names.add("Abigail");
        names.add("Michele");
        names.add("Jonathan");
        names.add("Abram");
        names.add("Barry");
        names.add("Tala");
        names.add("Olga");
        names.add("Mary");
        names.add("Jon");
        names.add("Dylan");

//        System.out.println(names.size());
//
//        System.out.println(names.get(6));
//
//        names.remove(3);
//        System.out.println(names.size());
//
//        names.clear();
//        System.out.println(names.size());

        for (String name : names) {
            System.out.println(name);
        }

        names.forEach(System.out::println);

    }
}
