package com.twu.calculator;

import static java.lang.Math.*;

public class SquareRootOperation implements Operation {

    public double performOperation(double accumulator) {
        return sqrt(accumulator);
    }
}
