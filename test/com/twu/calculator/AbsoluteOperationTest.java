package com.twu.calculator;

import org.junit.Assert;
import org.junit.Test;

public class AbsoluteOperationTest {

    @Test
    public void shouldReturnPositiveValue() {
        AbsoluteOperation absoluteOperation = new AbsoluteOperation(1.0);

        Assert.assertEquals(1.0,absoluteOperation.performOperatiaon(),0.2d);
    }
}