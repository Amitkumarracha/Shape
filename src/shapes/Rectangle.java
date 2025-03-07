package shapes;

// Rectangle class extending Shape
public class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    // Calculate Area of Rectangle
    public double calculateArea() {
        return length * width;
    }

    // Calculate Perimeter of Rectangle
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
