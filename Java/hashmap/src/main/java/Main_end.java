import java.util.HashMap;

public class Main_end {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(654, "Stu Dent");
        students.put(349, "Isjkdhf Ljksdf");
        students.put(762, "Fkjshd Oksjdh");
        students.put(349, "Basoid Yoisduf");

        students.values().forEach(System.out::println);

        students.remove(654);

        System.out.println(students.size());

    }
}
