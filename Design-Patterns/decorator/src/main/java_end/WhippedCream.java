public class WhippedCream extends CoffeeDecorator {
    private static final String DESCRIPTION = "Whipped Cream";
    private static final double COST = .15;

    public WhippedCream(Coffee coffee) {
        super(DESCRIPTION, COST, coffee);
    }
}
