package com.twu.calculator;

import org.junit.Test;

import static java.lang.Math.*;
import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldAcceptAddCommandsPrintTheResult() {
        Parser parser = new Parser("add 5", 2.0);

        assertEquals(5.0,parser.parse(),0.2d);
    }

    @Test
    public void shouldAcceptAddCommandsPrintTheResultWithPreInitiatedValue() {
        Parser parser = new Parser("add 2",6.0);

        assertEquals(8.0,parser.parse(),0.2d);
    }

    @Test
    public void shouldAcceptSubstracatCommandsPrintTheResult() {
        Parser parser = new Parser("subtract 2",0.0);

        assertEquals(-2.0,parser.parse(),0.2d);
    }

    @Test
    public void shouldAcceptSubstracatCommandsPrintTheResultWithPreInitiatedValue() {
        Parser parser = new Parser("subtract 2",2.0);

        assertEquals(0.0,parser.parse(),0.2d);
    }

    @Test
    public void shouldAcceptMultiplicationCommandPrintTheResult() {
        Parser parser = new Parser("multiply 2",0.0);

        assertEquals(0.0,parser.parse(),0.2d);
    }

    @Test
    public void shouldAcceptMultiplicationCommandPrintTheResultWithPreInitiatedValue() {
        Parser parser = new Parser("multiply 2",2.0);

        assertEquals(4.0,parser.parse(),0.2d);
    }

    @Test
    public void shouldAcceptDivisionCommandPrintTheResultWithoutPreInitiatedValue() {
        Parser parser = new Parser("divide 0.0",2.0);

        assertEquals(Double.NaN,parser.parse(),0.2d);
    }

    @Test
    public void shouldAcceptCancelCommandPrintTheResult() {
        Parser parser = new Parser("cancel",0.0);

        assertEquals(0.0,parser.parse(),0.2d);
    }

    @Test
    public void shouldAcceptAbsoluteCommandPrintTheResult() {
        Parser parser = new Parser("abs",-2.0);

        assertEquals(2.0,parser.parse(),0.2d);
    }

    @Test
    public void shouldAcceptNegativeCommandPrintTheResult() {
        Parser parser = new Parser("neg",2.0);

        assertEquals(-2.0,parser.parse(),0.2d);
    }

    @Test
    public void shouldAcceptSqrtCommandPrintTheResult() {
        Parser parser = new Parser("sqrt",2.0);

        assertEquals(sqrt(2.0),parser.parse(),0.2d);
    }

    @Test
    public void shouldAcceptSquareCommandPrintTheResult() {
        Parser parser = new Parser("sqr",2.0);

        assertEquals(4.0,parser.parse(),0.2d);
    }

}
