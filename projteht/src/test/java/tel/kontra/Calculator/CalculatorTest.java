package tel.kontra.Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(15, Calculator.add(10, 5));
        assertEquals(0, Calculator.add(0, 0));
        assertEquals(-15, Calculator.add(-10, -5));
        assertEquals(5, Calculator.add(10, -5));
        assertEquals(Integer.MAX_VALUE, Calculator.add(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE + 1, Calculator.add(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, Calculator.subtract(10, 5));
        assertEquals(0, Calculator.subtract(0, 0));
        assertEquals(-5, Calculator.subtract(-10, -5));
        assertEquals(15, Calculator.subtract(10, -5));
        assertEquals(Integer.MIN_VALUE, Calculator.subtract(Integer.MIN_VALUE, 0));
        assertEquals(Integer.MAX_VALUE - 1, Calculator.subtract(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testMultiply() {
        assertEquals(50, Calculator.multiply(10, 5));
        assertEquals(0, Calculator.multiply(0, 0));
        assertEquals(50, Calculator.multiply(-10, -5));
        assertEquals(-50, Calculator.multiply(10, -5));
        assertEquals(0, Calculator.multiply(Integer.MAX_VALUE, 0));
        assertEquals(Integer.MIN_VALUE, Calculator.multiply(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.divide(10, 5));
        assertEquals(1, Calculator.divide(-10, -10));
        assertEquals(-1, Calculator.divide(10, -10));
        assertEquals(0, Calculator.divide(0, 1));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(10, 0));
    }
}
