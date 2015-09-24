package com.twu.calculator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static java.lang.Math.*;
import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldAcceptAddCommandsPrintTheResult() {
        Parser parser = new Parser(2.0);

        assertEquals(7.0,parser.parse("add 5"),0.2d);
    }

    @Test
    public void shouldAcceptAddCommandsPrintTheResultWithPreInitiatedValue() {
        Parser parser = new Parser(6.0);

        assertEquals(8.0,parser.parse("add 2"),0.2d);
    }

    @Test
    public void shouldAcceptSubstracatCommandsPrintTheResult() {
        Parser parser = new Parser(0.0);

        assertEquals(-2.0,parser.parse("subtract 2"),0.2d);
    }

    @Test
    public void shouldAcceptSubstracatCommandsPrintTheResultWithPreInitiatedValue() {
        Parser parser = new Parser(2.0);

        assertEquals(0.0,parser.parse("subtract 2"),0.2d);
    }

    @Test
    public void shouldAcceptMultiplicationCommandPrintTheResult() {
        Parser parser = new Parser(0.0);

        assertEquals(0.0,parser.parse("multiply 2"),0.2d);
    }

    @Test
    public void shouldAcceptMultiplicationCommandPrintTheResultWithPreInitiatedValue() {
        Parser parser = new Parser(2.0);

        assertEquals(4.0,parser.parse("multiply 2"),0.2d);
    }

    @Test
    public void shouldAcceptDivisionCommandPrintTheResultWithoutPreInitiatedValue() {
        Parser parser = new Parser(2.0);

        assertEquals(Double.NaN,parser.parse("divide 0.0"),0.2d);
    }

    @Test
    public void shouldAcceptCancelCommandPrintTheResult() {
        Parser parser = new Parser(0.0);

        assertEquals(0.0,parser.parse("cancel"),0.2d);
    }

    @Test
    public void shouldAcceptAbsoluteCommandPrintTheResult() {
        Parser parser = new Parser(-2.0);

        assertEquals(2.0,parser.parse("abs"),0.2d);
    }

    @Test
    public void shouldAcceptNegativeCommandPrintTheResult() {
        Parser parser = new Parser(2.0);

        assertEquals(-2.0,parser.parse("neg"),0.2d);
    }

    @Test
    public void shouldAcceptSqrtCommandPrintTheResult() {
        Parser parser = new Parser(2.0);

        assertEquals(sqrt(2.0),parser.parse("sqrt"),0.2d);
    }

    @Test
    public void shouldAcceptSqrtCommandPrintTheResultAsNANForNegativeValue() {
        Parser parser = new Parser(-2.0);

        assertEquals(Double.NaN,parser.parse("sqrt"),0.2d);
    }

    @Test
    public void shouldAcceptSquareCommandPrintTheResult() {
        Parser parser = new Parser(2.0);

        assertEquals(4.0,parser.parse("sqr"),0.2d);
    }

    @Test
    public void shouldAcceptCuberootCommandPrintTheResult() {
        Parser parser = new Parser(2.0);

        assertEquals(cbrt(2.0),parser.parse("cubert"),0.2d);
    }

    @Test
    public void shouldAcceptCubeCommandPrintTheResult() {
        Parser parser = new Parser(2.0);

        assertEquals(pow(2.0, 3),parser.parse("cube"),0.2d);
    }

    @Test
    public void shouldNotAcceptInvalidCommandAndPrintPreviousValue() {
        Parser parser = new Parser(2.0);

        assertEquals(2.0,parser.parse("cubesddsf"),0.2d);
    }

    @Test
    public void shouldNotAcceptInvalidCommandAndPrintPreviousValue1() {
        Parser parser = new Parser(2.0);

        assertEquals(2.0,parser.parse("add add 5"),0.2d);
    }

    @Test
    public void shouldReturnTheInitialValueForRepeat0() {
        Parser parser = new Parser(2.0);

        assertEquals(2.0,parser.parse("repeat 0"),0.2d);
    }

    @Test
    public void shouldReturnTheValueForRepeat() {
        Parser parser = new Parser(0.0);
        parser.parse("add 1");

        assertEquals(3.0, parser.parse("repeat 1"), 0.2d);
    }

    @Rule
    public ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldExitFromTheApplication() {
        exit.expectSystemExit();

        Parser parser = new Parser(0.0);
        parser.parse("exit");
    }

}
