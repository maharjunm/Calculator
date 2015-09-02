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
}
