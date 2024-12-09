package geometry;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        double expectedArea = 4.0 * 5.0;
        assertEquals(expectedArea, rectangle.area(), 0.0001, "Area calculation is incorrect");
    }

    @Test
    public void testPerimeter() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        double expectedPerimeter = 2 * (4.0 + 5.0);
        assertEquals(expectedPerimeter, rectangle.perimeter(), 0.0001, "Perimeter calculation is incorrect");
    }

    @Test
    public void testToString() {
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        String expectedString = "Rectangle [width=4.0, height=5.0]";
        assertEquals(expectedString, rectangle.toString(), "toString method is incorrect");
    }
}


