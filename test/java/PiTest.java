import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PiTest {

    @Test
    public void approx() {
        double approximatedPi = Pi.approx(10e6);
        Assert.assertEquals(Math.PI, approximatedPi, 0.001);
    }
}