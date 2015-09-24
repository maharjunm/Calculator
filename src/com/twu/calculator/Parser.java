package com.twu.calculator;

import static java.lang.Math.*;

public class Parser {
    Calculator calculator;
    Operation operation;

    public Parser(double initialValue) {
        calculator = new Calculator(initialValue);

    }

    public double parse(String command) {
        if (command.equals("cancel")) {
            Operation operation = new CancelOperation();
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if (command.equals("neg")) {
            Operation operation = new NegativeOperation();
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if (command.equals("exit")) {
            System.exit(0);
        }
        if (command.equals("sqrt")) {
            Operation operation = new SquareRootOperation();
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if (command.equals("sqr")) {
            Operation operation = new SquareOperation();
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if (command.equals("abs")) {
            Operation operation = new AbsoluteOperation();
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if (command.equals("cubert")) {
            Operation operation = new CubeRootOperation();
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if (command.equals("cube")) {
            Operation operation = new CubeOperation();
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        String[] list = command.split(" ");
        double operand;
        try {
            operand = Double.parseDouble(list[1]);
        } catch (Exception e) {
            return calculator.getResult();
        }
        if (list[0].equals("add")) {
            Operation operation = new Adder(operand);
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if (list[0].equals("subtract")) {

            Operation operation = new Subtractor(operand);
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if (list[0].equals("multiply")) {
            Operation operation = new Multiplier(operand);
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if (list[0].equals("divide")) {
            Operation operation = new Divider(operand);
            calculator.performProcess(operation);

            return calculator.getResult();
        }
        if (list[0].equals("repeat")) {
            if (Integer.parseInt(list[1]) == 0) {
                return calculator.getResult();
            }
            double result = calculator.getResult();
            Operation[] operations = calculator.history.getNOperation(Integer.parseInt(list[1]));
            for (int i = 0; i < operations.length; i++) {
                result += operations[i].performOperation(result);
            }
            return result;
        }

        return calculator.getResult();
    }
}
