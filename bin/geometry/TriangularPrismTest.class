package geometry;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TriangularPrismTest {

    @Test
    public void testVolume() {
        TriangularPrism prism = new TriangularPrism(10.0, 5.0);
        double expectedVolume = 10.0 * 5.0;
        assertEquals(expectedVolume, prism.volume(), 0.0001, "Volume calculation is incorrect");
    }

    @Test
    public void testSurfaceArea() {
        TriangularPrism prism = new TriangularPrism(10.0, 5.0);
        double expectedSurfaceArea = 2 * 10.0 + 5.0;
        assertEquals(expectedSurfaceArea, prism.surfaceArea(), 0.0001, "Surface area calculation is incorrect");
    }

    @Test
    public void testToString() {
        TriangularPrism prism = new TriangularPrism(10.0, 5.0);
        String expectedString = "TriangularPrism [baseArea=10.0, height=5.0]";
        assertEquals(expectedString, prism.toString(), "toString method is incorrect");
    }
}
