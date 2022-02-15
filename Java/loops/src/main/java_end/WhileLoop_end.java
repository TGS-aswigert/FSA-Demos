public class WhileLoop {
    public static void fibonacciSequence(int count) {
        int i = 1, num1 = 0, num2 = 1;
        System.out.print("While Loop: Fibonacci Series of " + count + " numbers:");

        while (i <= count) {
            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;

            num1 = num2;

            num2 = sumOfPrevTwo;

            i++;
        }

        System.out.println("\n");
    }
}
