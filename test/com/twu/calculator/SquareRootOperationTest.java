package com.twu.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareRootOperationTest {

    @Test
    public void shouldReturnZeroForZero() {
        SquareRootOperation squareRootOperation = new SquareRootOperation();

        assertEquals(0.0, squareRootOperation.performOperation(0.0), 0.2d);
    }
}
