package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTests {
    private ICalculator calc;

    @Before
    public void setup() {
//        calc = new Calculator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(5, calc.add(2, 3));
        Assert.assertEquals(0, calc.add(0, 0));
        Assert.assertEquals(0, calc.add(-5, 5));

        Assert.assertEquals(2, calc.subtract(10, 8));

        Assert.assertEquals(25, calc.multiply(5, 5));

        Assert.assertEquals(5, calc.divide(10, 2));
    }
}
