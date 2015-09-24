package com.twu.calculator;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class CalulatorAppTest {

    @Test
    public void shouldGetTheInputFromTheUser() {
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Parser parser = mock(Parser.class);
        CalculatorApp calculatorApp = new CalculatorApp(display, userInput, parser);

        calculatorApp.start();

        verify(userInput, times(1)).getInput();
    }

    @Test
    public void shouldParseTheInputUsingParser() {
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Parser parser = mock(Parser.class);
        CalculatorApp calculatorApp = new CalculatorApp(display, userInput, parser);

        when(userInput.getInput()).thenReturn("Maharjun");
        calculatorApp.start();

        verify(parser, times(1)).parse(userInput.getInput());
    }

    @Test
    public void shouldPrintTheOutput() {
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        Parser parser = mock(Parser.class);
        CalculatorApp calculatorApp = new CalculatorApp(display, userInput, parser);

        when(userInput.getInput()).thenReturn("Maharjun");
        when(parser.parse(userInput.getInput())).thenReturn(0.0);
        calculatorApp.start();

        verify(display, times(1)).print(""+parser.parse(userInput.getInput()));
    }
}
