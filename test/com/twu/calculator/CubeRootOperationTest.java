package com.twu.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CubeRootOperationTest {

    @Test
    public void shouldReturnZeroForZero() {
        CubeRootOperation cubeRootOperation = new CubeRootOperation();

        assertEquals(0.0, cubeRootOperation.performOperation(0.0), 0.2d);
    }

    @Test
    public void shouldReturnTheValueForNonZero() {
        CubeRootOperation cubeRootOperation = new CubeRootOperation();

        assertEquals(Math.cbrt(3.0), cubeRootOperation.performOperation(3.0), 0.2d);
    }
}
