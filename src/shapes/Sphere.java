package shapes;

// Sphere class extending Shape and implementing Volume interface
public class Sphere extends Shape implements Volume {
    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        this.radius = radius;
    }

    // Calculate Area of Sphere (Surface Area)
    public double calculateArea() {
        return 4 * Math.PI * radius * radius;
    }

    // No perimeter for Sphere, return 0
    public double calculatePerimeter() {
        return 0;
    }

    // Calculate Volume of Sphere
    public double calculateVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }
}
