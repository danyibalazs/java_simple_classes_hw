import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        this.calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(8, calculator.add(3,5));
    }

    @Test
    public void testSubtract(){
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void testMultiply(){
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    public void testDivide(){
        assertEquals(3.5, calculator.divide(7, 2), 0.01);
    }
}
