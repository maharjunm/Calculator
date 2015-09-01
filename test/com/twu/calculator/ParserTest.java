package com.twu.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldAcceptAddCommandsPrintTheResult() {
        Parser parser = new Parser("add 5");

        assertEquals(5.0,parser.parse(),0.2d);
    }

}
