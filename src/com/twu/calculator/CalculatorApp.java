package com.twu.calculator;

import java.io.PrintStream;
import java.util.Scanner;

public class CalculatorApp {

    private final Display display;
    private final UserInput userInput;

    public CalculatorApp(Display display, UserInput userInput) {
        this.display = display;
        this.userInput = userInput;
    }

    public static void main(String[] args) {
        UserInput userInput = new UserInput(new Scanner(System.in));
        Display display = new Display(new PrintStream(System.out));
        CalculatorApp calculatorApp =new CalculatorApp(display,userInput);
        calculatorApp.start();
    }

    public void start() {
        String input = userInput.getInput();
    }
}
