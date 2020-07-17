package collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayUtilsTests {
    private IArrayUtils utils;

    @Before
    public void setup() {
//        utils = ArrayUtils();
    }

    @Test
    public void testSum() {
        Assert.assertEquals(24, new int[] {1, 3, 7, 4, 1, 8});
        Assert.assertEquals(3, new int[] {3});
        Assert.assertEquals(0, new int[] {-8, 3, 5});
    }

    @Test
    public void testFindLargestNumber() {
        Assert.assertEquals(8, new int[] {1, 3, 7, 4, 1, 8, -4});
        Assert.assertEquals(3, new int[] {3});
        Assert.assertEquals(5, new int[] {-8, 3, 5});
    }

    @Test
    public void testCalculateAverage() {
        Assert.assertEquals(2.3, new double[] {1.2, 3.1, 7.8, 4.0, -4.6});
        Assert.assertEquals(3.0, new double[] {3.0});
        Assert.assertEquals(0.0, new double[] {-8.5, 3.2, 5.3});
    }

    @Test
    public void testJoin() {
        Assert.assertEquals("XARW", new String[] {"X", "AR", "W"});
        Assert.assertEquals("QuickBrownFox", new String[] {"Quick", "Brown", "Fox"});
    }

    @Test
    public void testTakeFirstTwoNumbers() {
        int[] result1 = utils.takeFirstTwoNumbers(new int[]{1, 3, 7, 4, 1, 8, -4});
        Assert.assertEquals(1, result1[0]);
        Assert.assertEquals(3, result1[1]);

        int[] result2 = utils.takeFirstTwoNumbers(new int[]{-8, 3, 5});
        Assert.assertEquals(-8, result2[0]);
        Assert.assertEquals(3, result2[1]);
    }
}
