public abstract class CoffeeDecorator extends Coffee {
    private final Coffee coffee;

    protected CoffeeDecorator(String description, double cost, Coffee coffee) {
        super(description, cost);
        this.coffee = coffee;
    }

    @Override
    protected double getCost() {
        return coffee.getCost() + this.cost;
    }

    @Override
    public String getDescription() {
        return String.format("%s\nwith %s", coffee.getDescription(), description);
    }
}
