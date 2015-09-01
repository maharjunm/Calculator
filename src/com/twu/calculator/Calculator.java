package com.twu.calculator;

public class Calculator {

    double accumulator;

    public Calculator(double initialValue) {
        this.accumulator = initialValue;
    }

    public void performProcess(Operation operation) {
        this.accumulator = operation.performOperation(accumulator);
    }

    public double getResult() {
        return accumulator;
    }
}
