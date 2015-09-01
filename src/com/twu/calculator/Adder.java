package com.twu.calculator;

public class Adder implements Operation {
    private double operand;

    public Adder(double operand) {
        this.operand = operand;
    }

    public double performOperation(double accumulator) {
        return accumulator + operand;
    }
}
