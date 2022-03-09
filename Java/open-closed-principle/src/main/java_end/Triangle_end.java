public class Triangle_end implements Shape_end {
    public double base;
    public double height;

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }
}
