public abstract class Coffee {
    protected final String description;
    protected final double cost;

    protected Coffee(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    protected double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
