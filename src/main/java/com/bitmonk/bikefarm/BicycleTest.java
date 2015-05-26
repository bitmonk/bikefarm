import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BicycleTest {
    @Test
    public void shiftsUp() {
        InternalHubBicycle upshiftbike = new InternalHubBicycle();
        int initialStatus = upshiftbike.gear;
        boolean result = upshiftbike.shiftUp();
        int newStatus = upshiftbike.gear;
        assertTrue("failure - shiftUp returned non-true value.", result);
        assertEquals("failure - shiftUp did not result in expected gear change.", newStatus,initialStatus+1);
    }

}
