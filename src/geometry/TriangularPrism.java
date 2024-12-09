package geometry;

public class TriangularPrism extends Geometry3D {
    private double baseArea;
    private double height;

    /**
     * Constructs a Triangular Prism with the specified base area and height.
     *
     * @param baseArea the area of the triangular base
     * @param height   the height of the prism
     */
    public TriangularPrism(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    /**
     * Calculates the volume of the triangular prism.
     *
     * @return the volume of the triangular prism
     */
    @Override
    public double volume() {
        return baseArea * height;
    }

    /**
     * Calculates the surface area of the triangular prism.
     * Assumes only two triangular faces are considered.
     *
     * @return the surface area of the triangular prism
     */
    @Override
    public double surfaceArea() {
        return 2 * baseArea + height; // Adjust formula as needed for full surface area calculation
    }

    /**
     * Returns a string representation of the Triangular Prism.
     *
     * @return a string representation of the Triangular Prism
     */
    @Override
    public String toString() {
        return "TriangularPrism [baseArea=" + baseArea + ", height=" + height + "]";
    }
}
