package com.twu.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractTest {

    @Test
    public void shouldReturnTheValueAsZerowithoutPreInitiatedValue() {
        Subtractor subtractor = new Subtractor();

        assertEquals(0.0, subtractor.performOperation(), 0.2d);
    }
}
