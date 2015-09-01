package com.twu.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class DividerTest {

    @Test
    public void shouldReturnNaNWhenWeDivision() {
        Divider divider = new Divider(0.0);

        assertEquals(Double.NaN, divider.performOperation(2.0), 0.2d);
    }
}
