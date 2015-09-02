package com.twu.calculator;

import org.junit.Test;

import static java.lang.Math.*;
import static org.junit.Assert.*;

public class SquareRootOperationTest {

    @Test
    public void shouldReturnZeroForZero() {
        SquareRootOperation squareRootOperation = new SquareRootOperation();

        assertEquals(0.0, squareRootOperation.performOperation(0.0), 0.2d);
    }

    @Test
    public void shouldReturnZeroForNonZero() {
        SquareRootOperation squareRootOperation = new SquareRootOperation();

        assertEquals(sqrt(2.0), squareRootOperation.performOperation(2.0), 0.2d);
    }
}
