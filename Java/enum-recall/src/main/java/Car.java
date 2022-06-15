public class Car {
    private String color;
    private final double basePrice;

    public Car() {
        this.color = "Black";
        this.basePrice = 20_000.00;
    }

    public double getTotalPrice() {
        double total = this.basePrice;
        switch (this.color) {
            case "Black":
                total += 0;
                break;
            case "Blue":
                total += 2_000.00;
                break;
            case "White":
                total += 800;
                break;
            case "Red":
                total += 5_000;
                break;
            case "Green":
                total += 3_500;
                break;
            case "Yellow":
                total += 1_500;
                break;
        }
        return total;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
