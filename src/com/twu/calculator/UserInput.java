package com.twu.calculator;

import java.util.Scanner;

public class UserInput {
    private Scanner scanner;

    public UserInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getInput() {
        return scanner.next();
    }
}
