package com.twu.calculator;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Operation> history;

    History() {
        history = new ArrayList<>();
    }

    public void add(Operation operation) {
        history.add(operation);
    }

    public Object getList() {
        return history;
    }

    public Operation[] getNOperation(int noOfOperations) {
        Operation[] operations = new Operation[noOfOperations];
        for (int i = history.size() - noOfOperations, index = 0; i < history.size() ; i++, index++) {
            operations[index] = history.get(i);
        }
        return operations;
    }

    public boolean clear() {
        history = new ArrayList<>();
        if (history.size()== 0)
            return true;
        return false;
    }
}
