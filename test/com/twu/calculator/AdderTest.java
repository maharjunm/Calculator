package com.twu.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {

    @Test
    public void shouldReturnZeroWhenWeAddWithZero() {
        Adder adder = new Adder(0.0);

        assertEquals(0.0, adder.performOperation(0.0), 0.2d);
    }

    @Test
    public void shouldReturnTheResultWhenWeAddWithPreInitiatedValue() {
        Adder adder = new Adder(2.0);

        assertEquals(4.0, adder.performOperation(2.0), 0.2d);
    }
}
