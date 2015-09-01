package com.twu.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplierTest {

    @Test
    public void shouldReturnTheValueAsZeroWithoutPreInitiatedValue() {
        Multiplier multiplier = new Multiplier(0.0);

        assertEquals(0.0, multiplier.performOperation(0.0), 0.2d);
    }

    @Test
    public void shouldReturnTheValueAsZeroWithPreInitiatedValue() {
        Multiplier multiplier = new Multiplier(3.0);

        assertEquals(6.0, multiplier.performOperation(2.0), 0.2d);
    }
}
