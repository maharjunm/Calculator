package com.twu.calculator;

public class Calculator {

    double accumulator;

    public Calculator(double initialValue) {
        this.accumulator = initialValue;
    }

    public void performProcess(Operation operation, double operand) {
        this.accumulator = operation.performOperation(operand);
    }

    public double getResult() {
        return accumulator;
    }
}
