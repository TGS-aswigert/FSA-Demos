public class Cream extends CoffeeDecorator {
    private static final String DESCRIPTION = "Cream";
    private static final double COST = .50;

    public Cream(Coffee coffee) {
        super(DESCRIPTION, COST, coffee);
    }
}
