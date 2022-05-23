import java.util.Scanner;

public class Main_end {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your weight in pounds");
        double earthWeightInPounds = scanner.nextDouble();

        for (Planet_end p: Planet_end.values()) {
            System.out.printf("Your weight on %s is %.2f pounds%n", p, p.getSurfaceWeight(earthWeightInPounds));
        }
    }
}
