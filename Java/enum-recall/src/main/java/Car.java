public class Car {
    private Color color;
    private final double basePrice;

    public Car() {
        this.color = Color.BLACK;
        this.basePrice = 20_000.00;
    }

    public double getTotalPrice() {
        double total = this.basePrice;
        total += this.color.getPrice();
        return total;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
