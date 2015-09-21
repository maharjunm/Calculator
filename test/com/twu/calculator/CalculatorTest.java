package com.twu.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void shouldReturnTheAccumulatorValue() {
        Calculator calculator = new Calculator(0.0);

        assertEquals(0.0, calculator.getResult(), 0.00d);
    }

    @Test
    public void shouldPerformTheOperation() {
        Calculator calculator = new Calculator(0.0);
        calculator.performProcess(new Adder(1.0));

        assertEquals(1.0, calculator.getResult(), 0.00d);
    }
}
