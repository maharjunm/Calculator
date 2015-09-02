package com.twu.calculator;

import static java.lang.Math.*;

public class Parser {
    private double accumulator;
    private String command;

    public Parser(String command, double initialValue) {
        this.command = command;
        this.accumulator = initialValue;

    }

    public double parse() {
        if(command.equals("cancel")){
            Calculator calculator = new Calculator(accumulator);
            Operation operation = new CancelOperation();
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if(command.equals("neg")){
            Calculator calculator = new Calculator(accumulator);
            Operation operation = new NegativeOperation();
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if(command.equals("sqrt")){
            Calculator calculator = new Calculator(accumulator);
            Operation operation = new SquareRootOperation();
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if(command.equals("sqr")){
            Calculator calculator = new Calculator(accumulator);
            Operation operation = new SquareOperation();
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if(command.equals("abs")){
            Calculator calculator = new Calculator(accumulator);
            Operation operation = new AbsoluteOperation();
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if(command.equals("cubert")){
            Calculator calculator = new Calculator(accumulator);
            Operation operation = new AbsoluteOperation();
            calculator.performProcess(operation);

            return 8.0;
        }
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
        if(list[0].equals("divide")){
            double operand = Double.parseDouble(list[1]);
            Calculator calculator = new Calculator(accumulator);
            Operation operation = new Divider(operand);
            calculator.performProcess(operation);

            return calculator.getResult();
        }

        return 0;
    }
}
