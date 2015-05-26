import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BicycleTest {
    @Test
    public void test_shifts_up() {
        InternalHubBicycle upshiftbike = new InternalHubBicycle();
        int initialStatus = upshiftbike.gear;
        boolean result = upshiftbike.shiftUp();
        int newStatus = upshiftbike.gear;
        assertTrue("failure - shiftUp returned non-true value.", result);
        assertEquals("failure - shiftUp did not result in expected gear change.", newStatus,initialStatus+1);
    }

    @Test
    public void test_shifts_down() {
        InternalHubBicycle downshiftbike = new InternalHubBicycle();
        int initialStatus = downshiftbike.gear;
        boolean result = downshiftbike.shiftDown();
        int newStatus = downshiftbike.gear;
        assertTrue("failure - shiftDown returned non-true value.", result);
        assertEquals("failure - shiftDown did not result in expected gear change.", newStatus,initialStatus-1);
    }

    @Test
    public void test_accelerates() {
        InternalHubBicycle acceleratebike = new InternalHubBicycle();
        int initialStatus = acceleratebike.speed;
        boolean result = acceleratebike.speedUp(10);
        int newStatus = acceleratebike.speed;
        assertTrue("failure - speedUp returned non-true value.", result);
        assertEquals("failure - speedUp did not result in expected speed increase.", initialStatus+10, newStatus);
    }

    @Test
    public void test_decelerates() {
        InternalHubBicycle deceleratebike = new InternalHubBicycle();
        boolean accel_result = deceleratebike.speedUp(10);
        int initialStatus = deceleratebike.speed;
        boolean result = deceleratebike.applyBrakes(10);
        int newStatus = deceleratebike.speed;
        assertTrue("failure - speedUp returned non-true value.", accel_result);
        assertTrue("failure - applyBrakes returned non-true value.", result);
        assertEquals("failure - applyBrakes did not result in expected speed decrease.", initialStatus-10, newStatus);
    }

}
