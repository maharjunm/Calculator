package com.twu.calculator;

import java.io.PrintStream;
import java.util.Scanner;

public class CalculatorApp {

    private final Display display;
    private final UserInput userInput;
    private final Parser parser;

    public CalculatorApp(Display display, UserInput userInput, Parser parser) {
        this.parser = parser;
        this.display = display;
        this.userInput = userInput;
    }

    public static void main(String[] args) {
        UserInput userInput = new UserInput(new Scanner(System.in));
        Display display = new Display(new PrintStream(System.out));
        Parser parser = new Parser(0.0);
        CalculatorApp calculatorApp =new CalculatorApp(display,userInput, parser);
        calculatorApp.start();
    }

    public void start() {
        String input = userInput.getInput();
        display.print(""+parser.parse(input));
    }
}
