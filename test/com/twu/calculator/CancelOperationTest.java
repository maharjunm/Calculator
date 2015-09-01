package com.twu.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CancelOperationTest {
    @Test
    public void shouldReturnZeroWhenCancelIsCalled() {
        CancelOperation cancelOperation = new CancelOperation();

        assertEquals(0.0, cancelOperation.performOperation(0.0), 0.2d);
    }
}
