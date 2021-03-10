import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import Utility.Square;
import org.testng.Assert;

import java.io.IOException;

public class SquareTest {

    @Test
    public void TestAreaIsPositiveForPositiveValuedSide() throws IOException {
        Square newSquare = new Square(4);
        int expectedArea = 16;

        assertEquals(expectedArea,newSquare.area());
    }
    @Test
    public void TestAreaThrowsExceptionForNegativeValuedSide() throws IOException {
        Square newSquare = new Square(-4);

        try {
            assertEquals("Side cannot be negative", newSquare.area());
        }
        catch (Exception e) {
            String expectedMessage = "Side cannot be negative";

            Assert.assertEquals(  expectedMessage, e.getMessage() );
        }
    }

    @Test
    public void TestAreaThrowsExceptionForZeroValuedSide() throws IOException {
        Square newSquare = new Square(0);

        try {
            assertEquals("Side cannot be Zero", newSquare.area());
        }
        catch (Exception e) {
            String expectedMessage = "Side cannot be Zero";

            Assert.assertEquals(  expectedMessage, e.getMessage() );
        }
    }
    @Test
    public void testPerimeterIsPositiveForPositiveValuedSide(){
        Square newSquare = new Square(10);
        int expectedPerimeter=40;

        assertEquals(expectedPerimeter,newSquare.perimeter());
    }
}
