package geometry;

public class Rectangle extends Geometry2D {
    private double width;
    private double height;

    /**
     * Constructs a Rectangle with the specified width and height.
     *
     * @param width  the width of the rectangle
     * @param height the height of the rectangle
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return the area of the rectangle
     */
    @Override
    public double area() {
        return width * height;
    }

    /**
     * Calculates the perimeter of the rectangle.
     *
     * @return the perimeter of the rectangle
     */
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    /**
     * Returns a string representation of the Rectangle.
     *
     * @return a string representation of the Rectangle
     */
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}

