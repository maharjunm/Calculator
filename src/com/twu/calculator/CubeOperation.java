package com.twu.calculator;

import static java.lang.Math.*;

public class CubeOperation implements Operation {
    public double performOperation(double accumulator) {
        return pow(accumulator, 3);
    }
}
