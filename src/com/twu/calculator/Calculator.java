package com.twu.calculator;

public class Calculator {

    private double accumulator;
    History history = new History();

    public Calculator(double initialValue) {
        this.accumulator = initialValue;
    }

    public void performProcess(Operation operation) {
        history.add(operation);
        this.accumulator = operation.performOperation(accumulator);
    }

    public double getResult() {
        return accumulator;
    }
}
