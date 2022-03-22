public class Syrup extends CoffeeDecorator {
    private static final String DESCRIPTION = "Syrup";
    private static final double COST = .25;

    public Syrup(Coffee coffee) {
        super(DESCRIPTION, COST, coffee);
    }
}
