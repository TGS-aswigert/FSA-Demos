import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private final String logFile = "src/main/resources/demo_log.txt";
    private PrintWriter writer;

    public Logger() {
        try {
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw, true);
        } catch (IOException ignored) {}
    }

    public void logWithdraw (String account, double amount) {
        writer.println("WITHDRAW (" + account + "): $" + amount);
    }

    public void logDeposit (String account, double amount) {
        writer.println("DEPOSIT (" + account + "): $" + amount);
    }

    public void logTransfer (String fromAccount, String toAccount, double amount) {
        writer.println("TRANSFER (" + fromAccount + "->" + toAccount + "): $" + amount);
    }}