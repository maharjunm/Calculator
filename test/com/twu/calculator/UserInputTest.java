package com.twu.calculator;

import org.junit.Test;

import java.util.Scanner;

import static org.mockito.Mockito.mock;

public class UserInputTest {

    @Test
    public void shouldTakeTheInputFromTheUser() {
        UserInput userInput = mock(UserInput.class);
        userInput.getInput();
    }
}
