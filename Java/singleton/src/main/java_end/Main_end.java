public class Main {
    public static void main(String[] args) {
        Logger_end logger = Logger_end.getInstance();
        logger.logWithdraw("My account", 200.00);

        Logger_end myLog = Logger_end.getInstance();
        myLog.logTransfer("One", "Two", 546.15);
    }
}
