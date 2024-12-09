package geometry;

public class Sphere extends Geometry3D {
    private double radius;

    /**
     * Constructs a Sphere with the specified radius.
     *
     * @param radius the radius of the sphere
     */
    public Sphere(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the volume of the sphere.
     *
     * @return the volume of the sphere
     */
    @Override
    public double volume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    /**
     * Calculates the surface area of the sphere.
     *
     * @return the surface area of the sphere
     */
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    /**
     * Returns a string representation of the Sphere.
     *
     * @return a string representation of the Sphere
     */
    @Override
    public String toString() {
        return "Sphere [radius=" + radius + "]";
    }
}


