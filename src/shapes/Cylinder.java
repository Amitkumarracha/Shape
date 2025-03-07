package shapes;

// Cylinder class extending Shape and implementing Volume interface
public class Cylinder extends Shape implements Volume {
    private double radius, height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    // Calculate Area of Cylinder (Surface Area)
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // No perimeter for Cylinder, return 0
    public double calculatePerimeter() {
        return 0;
    }

    // Calculate Volume of Cylinder
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
}
