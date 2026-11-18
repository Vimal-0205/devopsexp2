package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testAddition() {
        assertEquals(15, Main.add(10, 5), 0);
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, Main.subtract(10, 5), 0);
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, Main.multiply(10, 5), 0);
    }

    @Test
    public void testDivision() {
        assertEquals(2, Main.divide(10, 5), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        Main.divide(10, 0);
    }
}