package com.twu.calculator;

import org.junit.Test;

import java.io.PrintStream;
import java.util.Scanner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class CalulatorAppTest {

    @Test
    public void shouldGetTheInputFromTheUser() {
        Display display = mock(Display.class);
        UserInput userInput = mock(UserInput.class);
        CalculatorApp calculatorApp = new CalculatorApp(display, userInput);

        calculatorApp.start();

        verify(userInput, times(1)).getInput();
    }
}
