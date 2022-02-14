import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int month;
        String monthString;

        System.out.println("Input a number between 1 and 12");
        month = scanner.nextInt();

        if (month == 1) {
            monthString = "January";
        } else if (month == 2) {
            monthString = "February";
        } else if (month == 3) {
            monthString = "March";
        } else if (month == 4) {
            monthString = "April";
        } else if (month == 5) {
            monthString = "May";
        } else if (month == 6) {
            monthString = "June";
        } else if (month == 7) {
            monthString = "July";
        } else if (month == 8) {
            monthString = "August";
        } else if (month == 9) {
            monthString = "September";
        } else if (month == 10) {
            monthString = "October";
        } else if (month == 11) {
            monthString = "November";
        } else if (month == 12) {
            monthString = "December";
        } else {
            monthString = "Error: The number " + month + " does not correspond to a month";
        }

        System.out.println(monthString);
    }
}
