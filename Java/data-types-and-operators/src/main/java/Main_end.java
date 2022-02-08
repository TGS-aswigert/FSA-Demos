public class Main_end {
    public static void main(String[] args) {
        boolean x = true;
//        x++;
        System.out.println(x);

        double d = 10.5;
        d++;
        System.out.println(d);

        int a = 10;
        int b = 25;

        if (a >= 5 && b <= 20) {
            System.out.println("The first line is true");
        } else if ( a >= 15 || b > 20) {
            System.out.println("The second line is true");
        } else {
            System.out.println("No line is true");
        }
    }
}
