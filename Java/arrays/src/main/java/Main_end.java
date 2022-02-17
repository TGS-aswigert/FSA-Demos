import java.util.Scanner;

public class Main_end {
    public static void main(String[] args) {

        int arrayLimit = 5;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers 5 numbers:");

        int[] arr = new int[arrayLimit];

        for (int i = 0; i < arrayLimit; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int number: arr) {
            sum += number;
        }

        System.out.println("The sum of your numbers is: " + sum);

    }
}
