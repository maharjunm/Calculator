package com.twu.calculator;

public class Multiplier implements Operation {
    private double operand;

    public Multiplier(double operand) {
        this.operand = operand;
    }

    public double performOperation(double accumulator) {
        return accumulator * operand;
    }
}
