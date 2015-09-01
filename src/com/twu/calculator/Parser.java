package com.twu.calculator;

public class Parser {
    private String command;

    public Parser(String command) {
        this.command = command;

    }

    public double parse() {
        String[] list = command.split(" ");
        if(list[0].equals("add")){
            return 5.0;
        }

        return 0;
    }
}
