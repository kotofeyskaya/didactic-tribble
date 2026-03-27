package com.example.app;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testAdd() {
        assertEquals(8.0, calculator.add(5, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(6.0, calculator.subtract(10, 4));
    }

    @Test
    void testMultiply() {
        assertEquals(42.0, calculator.multiply(6, 7));
    }

    @Test
    void testDivide() {
        assertEquals(5.0, calculator.divide(15, 3));
    }

    @Test
    void testDivideByZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-3.0, calculator.add(-1, -2));
    }
}
