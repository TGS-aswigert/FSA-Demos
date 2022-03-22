public class Main {
    public static void main(String[] args) {
        String messageFormat = "Your %s\nis ready for pick up for %.2f\n\n";

        Coffee myCoffee = new Cream(new DripCoffee());

        Coffee theWorks = new WhippedCream(new Cream(new Syrup(new DripCoffee())));

        System.out.printf(messageFormat, myCoffee.getDescription(),
                myCoffee.getCost());

        System.out.printf(messageFormat, theWorks.getDescription(),
                theWorks.getCost());
    }
}
