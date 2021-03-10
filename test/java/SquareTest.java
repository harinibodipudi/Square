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
            assertEquals("Sides cannot be negative", newSquare.area());
        }
        catch (Exception e) {
            String expectedMessage = "Sides cannot be negative";

            Assert.assertEquals(  expectedMessage, e.getMessage() );
        }
    }

}
