import java.util.Scanner;

public class Main_end {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month;
        String monthString;

        System.out.println("Input a number between 1 and 12");
        month = scanner.nextInt();

        monthString = switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Error: The number " + month + " does not correspond with a month";
        };

        System.out.println(monthString);
    }
}
