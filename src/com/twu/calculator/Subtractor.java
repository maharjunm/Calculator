package com.twu.calculator;

public class Subtractor implements Operation {

    private double operand;

    public Subtractor(double operand) {
        this.operand = operand;
    }

    public double performOperation(double accumulator) {
        return accumulator - operand;
    }
}
