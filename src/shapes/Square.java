package shapes;

// Square class extending Shape
public class Square extends Shape {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    // Calculate Area of Square
    public double calculateArea() {
        return side * side;
    }

    // Calculate Perimeter of Square
    public double calculatePerimeter() {
        return 4 * side;
    }
}
