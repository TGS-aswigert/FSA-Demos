public class Rectangle_end implements Shape_end {
    public double length;
    public double width;

    @Override
    public double calculateArea() {
        return length*width;
    }
}
