package com.twu.calculator;

import org.junit.Assert;
import org.junit.Test;

public class AbsoluteOperationTest {

    @Test
    public void shouldReturnPositiveValue() {
        AbsoluteOperation absoluteOperation = new AbsoluteOperation();

        Assert.assertEquals(1.0,absoluteOperation.performOperation(1.0),0.2d);
    }
}