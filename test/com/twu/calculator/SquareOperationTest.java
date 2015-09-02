package com.twu.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareOperationTest {

    @Test
    public void shouldReturnZeroForInitialValue() {
        SquareOperation squareOperation = new SquareOperation();

        assertEquals(0.0, squareOperation.performOperation(0.0), 0.2d);
    }
}
