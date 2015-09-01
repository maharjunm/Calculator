package com.twu.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {

    @Test
    public void shouldReturnZeroWhenWeAddWIthZero() {
        Adder adder = new Adder(0.0);

        assertEquals(0.0, adder.performOperation(0.0), 0.2d);
    }
}
