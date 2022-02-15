public class ForLoop {
    public static void fibonacciSequence(int count) {
        int num1 = 0, num2 = 1;
        System.out.print("For Loop: Fibonacci Series of " + count + " numbers:");
        for (int i = 1; i <= count; ++i) {
            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;

            num1 = num2;

            num2 = sumOfPrevTwo;
        }

        System.out.println("\n");
    }
}
