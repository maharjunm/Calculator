package com.twu.calculator;

import org.junit.Assert;
import org.junit.Test;

public class NegativeOperationTest {

    @Test
    public void shouldReturnTheNegativeValueWhenWeGivePositiveValue() {
        NegativeOperation negativeOperation = new NegativeOperation();

        Assert.assertEquals(-2.0,negativeOperation.performOPeration(2.0),0.2d);
    }

    @Test
    public void shouldReturnThePositiveValueWhenWeGiveNegativeValue() {
        NegativeOperation negativeOperation = new NegativeOperation();

        Assert.assertEquals(2.0,negativeOperation.performOPeration(-2.0),0.2d);
    }
}
