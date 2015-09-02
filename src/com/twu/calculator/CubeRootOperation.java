package com.twu.calculator;

import static java.lang.Math.*;

public class CubeRootOperation implements Operation {

    @Override
    public double performOperation(double accumulator) {
        return cbrt(accumulator);
    }
}
