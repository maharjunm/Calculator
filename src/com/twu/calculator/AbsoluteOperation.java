package com.twu.calculator;

import static java.lang.Math.*;

public class AbsoluteOperation implements Operation {

    public double performOperation(double accumulator) {
        return abs(accumulator);
    }
}
