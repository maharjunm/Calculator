package com.twu.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CubeOperationTest {

    @Test
    public void shouldReturnZeroForZero() {
        CubeOperation cubeOperation = new CubeOperation();

        Assert.assertEquals(0.0,cubeOperation.performOperation(0.0),0.2d);
    }

    @Test
    public void shouldReturnTheValueForNonZeroValues() {
        CubeOperation cubeOperation = new CubeOperation();

        Assert.assertEquals(8.0, cubeOperation.performOperation(2.0), 0.2d);
    }
}
