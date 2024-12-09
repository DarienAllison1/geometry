package geometry;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class TriangleTest {

    @Test
    public void testArea() {
        Triangle triangle = new Triangle(6.0, 4.0, 5.0, 6.0, 7.0);
        double expectedArea = (6.0 * 4.0) / 2;
        assertEquals(expectedArea, triangle.area(), 0.0001, "Area calculation is incorrect");
    }

    @Test
    public void testPerimeter() {
        Triangle triangle = new Triangle(6.0, 4.0, 5.0, 6.0, 7.0);
        double expectedPerimeter = 5.0 + 6.0 + 7.0;
        assertEquals(expectedPerimeter, triangle.perimeter(), 0.0001, "Perimeter calculation is incorrect");
    }

    @Test
    public void testToString() {
        Triangle triangle = new Triangle(6.0, 4.0, 5.0, 6.0, 7.0);
        String expectedString = "Triangle [base=6.0, height=4.0, sides=5.0, 6.0, 7.0]";
        assertEquals(expectedString, triangle.toString(), "toString method is incorrect");
    }
}
