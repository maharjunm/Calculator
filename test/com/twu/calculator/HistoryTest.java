package com.twu.calculator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class HistoryTest {

    @Test
    public void shouldAddOperationToHistoryWhenAnOperationIsAdded() {
        History history = new History();
        Operation operation = new Adder(5.0);
        history.add(operation);
        List<Operation> list = new ArrayList<>();
        list.add(operation);

        assertEquals(list, history.getList());
    }

    @Test
    public void shouldGetOperationFromHistoryWhenOneOperationIsNeeded() {
        History history = new History();
        Operation operation = new Adder(5.0);
        Operation[] operations = {operation};
        history.add(operation);

        assertArrayEquals(operations, history.getNOperation(1));
    }

    @Test
    public void shouldGetOperationFromHistoryWhenTwoOperationIsNeeded() {
        History history = new History();
        Operation operation1 = new Adder(5.0);
        Operation operation2 = new Adder(5.0);
        history.add(operation1);
        history.add(operation2);
        Operation[] operations = {operation1, operation2};

        assertArrayEquals(operations, history.getNOperation(2));
    }
}
