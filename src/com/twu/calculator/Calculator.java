package com.twu.calculator;

import java.util.ArrayList;

public class Calculator {

    private double accumulator;
    History history = new History();

    public Calculator(double initialValue) {
        this.accumulator = initialValue;
    }

    public void performProcess(Operation operation) {
        this.accumulator = operation.performOperation(accumulator);
        history.add(operation);
    }

    public double getResult() {
        return accumulator;
    }
}
