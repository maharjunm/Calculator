package com.twu.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractTest {

    @Test
    public void shouldReturnTheValueAsZerowithoutPreInitiatedValue() {
        Subtractor subtractor = new Subtractor(0.0);

        assertEquals(0.0, subtractor.performOperation(0.0), 0.2d);
    }


    @Test
    public void shouldReturnTheValueAsZerowithPreInitiatedValue() {
        Subtractor subtractor = new Subtractor(1.0);

        assertEquals(-1.0, subtractor.performOperation(0.0), 0.2d);
    }
}
