package com.twu.calculator;

public class Parser {
    private double accumulator;
    private String command;

    public Parser(String command, double initialValue) {
        this.command = command;
        this.accumulator = initialValue;

    }

    public double parse() {
        String[] list = command.split(" ");
        if(list[0].equals("add")){
            double operand = Double.parseDouble(list[1]);
            Calculator calculator = new Calculator(accumulator);
            Operation operation = new Adder(operand);
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if(list[0].equals("subtract")){
            double operand = Double.parseDouble(list[1]);
            Calculator calculator = new Calculator(accumulator);
            Operation operation = new Subtractor(operand);
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if(list[0].equals("multiply")){
            double operand = Double.parseDouble(list[1]);
            Calculator calculator = new Calculator(accumulator);
            Operation operation = new Multiplier(operand);
            calculator.performProcess(operation);

            return calculator.getResult();
        }

        return 0;
    }
}
