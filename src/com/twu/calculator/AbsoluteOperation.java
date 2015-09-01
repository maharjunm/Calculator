package com.twu.calculator;

import static java.lang.Math.*;

public class AbsoluteOperation {
    private double operand;

    public AbsoluteOperation(double operand) {
        this.operand = operand;
    }

    public double performOperation() {
        return abs(operand);
    }
}
