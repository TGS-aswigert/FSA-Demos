import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class RoboFriend {
    private final String userName;
    private final Scanner scanner = new Scanner(System.in);

    public RoboFriend() {
        System.out.println("Hello, what's your name?");
        this.userName = scanner.nextLine();
        greetUser();
        respondToQuestion();
    }

    private void greetUser() {
        System.out.println("Nice to meet you " + this.userName);
        System.out.println("Ask me a question about the date or time! (enter 'quit' to end conversation)");
    }

    private LocalDate getDate() {
        return LocalDate.now();
    }

    private LocalTime getTime() {
        return LocalTime.now();
    }

    private LocalDateTime getDateAndTime() {
        return LocalDateTime.now();
    }

    private void respondToQuestion() {
        String question = scanner.nextLine();
        if (question.contains("date") && question.contains("time")) {
            System.out.println("The date and time are " + getDateAndTime());
        } else if (question.contains("date")) {
            System.out.println("Today's date is " + getDate());
        } else if (question.contains("time")) {
            System.out.println("The current time is " + getTime());
        } else if (question.equals("quit")) {
            System.out.println("Thanks for hanging out with me! Goodbye :)");
            System.exit(1);
        } else {
            System.out.println("I'm sorry I can only answer questions about the date or time");
        }
        respondToQuestion();
    }
}
