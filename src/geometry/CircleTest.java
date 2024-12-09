package geometry;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CircleTest {

    @Test
    public void testArea() {
        Circle circle = new Circle(5.0);
        double expectedArea = Math.PI * 5.0 * 5.0;
        assertEquals(expectedArea, circle.area(), 0.0001, "Area calculation is incorrect");
    }

    @Test
    public void testPerimeter() {
        Circle circle = new Circle(5.0);
        double expectedPerimeter = 2 * Math.PI * 5.0;
        assertEquals(expectedPerimeter, circle.perimeter(), 0.0001, "Perimeter calculation is incorrect");
    }

    @Test
    public void testToString() {
        Circle circle = new Circle(5.0);
        String expectedString = "Circle [radius=5.0]";
        assertEquals(expectedString, circle.toString(), "toString method is incorrect");
    }
}
