import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import Utility.Square;

public class SquareTest {
    @Test
    public void TestAreaIsPositiveForPositiveValuedSide(){
        Square newSquare = new Square(4);
        int expectedArea = 16;
        assertEquals(expectedArea,newSquare.area());
    }
}
