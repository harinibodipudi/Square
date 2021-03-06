import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import Utility.Square;

import org.testng.Assert;
import java.io.IOException;

public class SquareTest {

    @Test
    public void testAreaIsPositiveForPositiveValuedSide() throws IOException {
        Square newSquare = new Square(4);
        int expectedArea = 16;

        assertEquals(expectedArea,newSquare.area());
    }
    @Test
    public void testAreaThrowsExceptionForNegativeValuedSide() throws IOException {
        Square newSquare = new Square(-4);

        try {
            assertEquals("Rectangle sides do not support negative and Zero Values", newSquare.area());
        }
        catch (Exception e) {
            String expectedMessage = "Rectangle sides do not support negative and Zero Values";

            Assert.assertEquals(  expectedMessage, e.getMessage() );
        }
    }

    @Test
    public void testAreaThrowsExceptionForZeroValuedSide() throws IOException {
        Square newSquare = new Square(0);

        try {
            assertEquals("Rectangle sides do not support negative and Zero Values", newSquare.area());
        }
        catch (Exception e) {
            String expectedMessage = "Rectangle sides do not support negative and Zero Values";

            Assert.assertEquals(  expectedMessage, e.getMessage() );
        }
    }
    @Test
    public void testPerimeterIsPositiveForPositiveValuedSide() throws IOException {
        Square newSquare = new Square(10);
        int expectedPerimeter=40;

        assertEquals(expectedPerimeter,newSquare.perimeter());
    }

    @Test
    public void testPerimeterThrowsExceptionForNegativeValuedSide() throws IOException {
        Square newSquare = new Square(-10);

        try {
            assertEquals("Rectangle sides do not support negative and Zero Values", newSquare.perimeter());
        }
        catch (Exception e) {
            String expectedMessage = "Rectangle sides do not support negative and Zero Values";

            Assert.assertEquals(  expectedMessage, e.getMessage() );
        }
    }

    @Test
    public void testPerimeterThrowsExceptionForZeroValuedSide() throws IOException {
        Square newSquare = new Square(0);

        try {
            assertEquals("Rectangle sides do not support negative and Zero Values", newSquare.perimeter());
        }
        catch (Exception e) {
            String expectedMessage = "Rectangle sides do not support negative and Zero Values";

            Assert.assertEquals(  expectedMessage, e.getMessage() );
        }
    }
}
