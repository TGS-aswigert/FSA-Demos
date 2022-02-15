public class DoWhileLoop {
    public static void fibonacciSequence(int count) {
        int i = 1, num1 = 0, num2 = 1;
        System.out.print("Do While Loop: Fibonacci Series of " + count + " numbers:");

        do {
            System.out.print(num1+" ");

            int sumOfPrevTwo = num1 + num2;

            num1 = num2;

            num2 = sumOfPrevTwo;

            i++;
        } while (i <= count);

        System.out.println("\n");
    }
}
