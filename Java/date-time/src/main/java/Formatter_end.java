import java.time.format.DateTimeFormatter;

public class Formatter_end {
    public DateTimeFormatter formatDate() {
        return DateTimeFormatter.ofPattern("MM-dd-yyyy");
    }

    public DateTimeFormatter formatTime() {
        return DateTimeFormatter.ofPattern("HH:mm");
    }

    public DateTimeFormatter formatDateTime() {
        return DateTimeFormatter.ofPattern("HH:mm E, MMM dd yyyy");
    }
}
