package geometry;


public class Circle extends Geometry2D {
    private double radius;

    /**
     * Constructs a Circle with the specified radius.
     *
     * @param radius the radius of the circle
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     *
     * @return the area of the circle
     */
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the perimeter (circumference) of the circle.
     *
     * @return the perimeter of the circle
     */
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Returns a string representation of the Circle.
     *
     * @return a string representation of the Circle
     */
    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }
}

