package geometry;

public class Triangle extends Geometry2D {
    private double base;
    private double height;
    private double sideA, sideB, sideC;

    /**
     * Constructs a Triangle with the specified dimensions.
     *
     * @param base   the base of the triangle
     * @param height the height of the triangle
     * @param sideA  the length of side A
     * @param sideB  the length of side B
     * @param sideC  the length of side C
     */
    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    /**
     * Calculates the area of the triangle.
     *
     * @return the area of the triangle
     */
    @Override
    public double area() {
        return (base * height) / 2;
    }

    /**
     * Calculates the perimeter of the triangle.
     *
     * @return the perimeter of the triangle
     */
    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    /**
     * Returns a string representation of the Triangle.
     *
     * @return a string representation of the Triangle
     */
    @Override
    public String toString() {
        return "Triangle [base=" + base + ", height=" + height + ", sides=" + sideA + ", " + sideB + ", " + sideC + "]";
    }
}
