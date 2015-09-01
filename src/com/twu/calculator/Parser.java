package com.twu.calculator;

public class Parser {
    private String command;

    public Parser(String command) {
        this.command = command;

    }

    public double parse() {
        String[] list = command.split(" ");
        if(list[0].equals("add")){
            double operand = Double.parseDouble(list[1]);
            Calculator calculator = new Calculator(0.0);
            Operation operation = new Adder(0.0);
            calculator.performProcess(operation,operand);

            return calculator.getResult();
        }

        return 0;
    }
}
