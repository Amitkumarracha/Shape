package shapes;

// Equilateral Pyramid (Square Base) class implementing Volume
public class EquilateralPyramid extends Shape implements Volume {
    private double base, height;

    public EquilateralPyramid(double base, double height) {
        super("Equilateral Pyramid");
        this.base = base;
        this.height = height;
    }

    // Calculate Base Area of Pyramid
    public double calculateArea() {
        return base * base;
    }

    // Calculate Perimeter of Pyramid Base
    public double calculatePerimeter() {
        return 4 * base;
    }

    // Calculate Volume of Pyramid
    public double calculateVolume() {
        return (1.0 / 3) * base * base * height;
    }
}
