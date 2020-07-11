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
    }
}
