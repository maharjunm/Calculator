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

        assertEquals(list,history.getList());
    }

    @Test
    public void shouldGetOperationFromHistoryWhenOneOperationIsNeeded() {
        History history = new History();
        Operation operation = new Adder(5.0);
        history.add(operation);

        assertEquals(operation,history.getNOperation(1));
    }
}
