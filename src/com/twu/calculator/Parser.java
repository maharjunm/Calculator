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
            Operation operation = new CubeRootOperation();
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if(command.equals("cube")){
            Calculator calculator = new Calculator(accumulator);
            Operation operation = new CubeOperation();
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        String[] list = command.split(" ");
        double operand;
        try {
            operand = Double.parseDouble(list[1]);
        }
        catch (Exception e) {
            return accumulator;
        }
        if(list[0].equals("add")){
            Calculator calculator = new Calculator(accumulator);
            Operation operation = new Adder(operand);
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if(list[0].equals("subtract")){

            Calculator calculator = new Calculator(accumulator);
            Operation operation = new Subtractor(operand);
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if(list[0].equals("multiply")){
            Calculator calculator = new Calculator(accumulator);
            Operation operation = new Multiplier(operand);
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if(list[0].equals("divide")){
            Calculator calculator = new Calculator(accumulator);
            Operation operation = new Divider(operand);
            calculator.performProcess(operation);

            return calculator.getResult();
        }

        return accumulator;
    }
}
