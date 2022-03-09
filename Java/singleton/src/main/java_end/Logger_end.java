import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger_end {
    private final String logFile = "src/main/resources/demo_log.txt";
    private PrintWriter writer;
    private static Logger_end logger = null;

    private Logger_end() {
        try {
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw, true);
        } catch (IOException ignored) {}
    }

    public static Logger_end getInstance() {
        if(logger == null) {
            logger = new Logger();
        }
        return logger;
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