package shapes;

// Abstract class Shape
public abstract class Shape {
    protected String shapeName;

    // Constructor
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    // Getter method for shapeName
    public String getShapeName() {
        return shapeName;
    }

    // Abstract methods
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}
