package com.twu.calculator;

public class Divider implements Operation {

    private double operand;

    public Divider(double operand) {
        this.operand = operand;
    }

    public double performOperation(double accumulator) {
        if(operand == 0)
            return Double.NaN;
        return accumulator / operand;
    }
}
