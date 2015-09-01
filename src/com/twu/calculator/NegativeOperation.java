package com.twu.calculator;

public class NegativeOperation implements Operation {
    @Override
    public double performOperation(double accumulator) {
        return -accumulator;
    }
}
