package geometry;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class SphereTest {

    @Test
    public void testVolume() {
        Sphere sphere = new Sphere(3.0);
        double expectedVolume = (4.0 / 3) * Math.PI * Math.pow(3.0, 3);
        assertEquals(expectedVolume, sphere.volume(), 0.0001, "Volume calculation is incorrect");
    }

    @Test
    public void testSurfaceArea() {
        Sphere sphere = new Sphere(3.0);
        double expectedSurfaceArea = 4 * Math.PI * Math.pow(3.0, 2);
        assertEquals(expectedSurfaceArea, sphere.surfaceArea(), 0.0001, "Surface area calculation is incorrect");
    }

    @Test
    public void testToString() {
        Sphere sphere = new Sphere(3.0);
        String expectedString = "Sphere [radius=3.0]";
        assertEquals(expectedString, sphere.toString(), "toString method is incorrect");
    }
}

