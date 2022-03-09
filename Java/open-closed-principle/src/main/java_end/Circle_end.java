public class Circle_end implements Shape_end {
    public double radius;

    @Override
    public double calculateArea() {
        return Math.PI*(radius*radius);
    }
}
