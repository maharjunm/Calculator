package com.twu.calculator;

public class Subtractor {

    private double operand;

    public Subtractor(double operand) {
        this.operand = operand;
    }

    public double performOperation(double accumulator) {
        return accumulator - operand;
    }
}
