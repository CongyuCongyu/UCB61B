import static org.junit.Assert.*;
import org.junit.Test;

public class FlikTest {

    @Test(timeout = 1000)
    public void testIsSameNumber() {
        /* assertEquals for comparison of ints takes two arguments:
        assertEquals(expected, actual).
        if it is false, then the assertion will be false, and this test will fail.
        */

        assertTrue(Flik.isSameNumber(5, 5));
    }
}
