package shapes;
import java.util.Scanner;

// Circle class extending Shape
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Calculate Area of Circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Calculate Perimeter of Circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
