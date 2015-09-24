package com.twu.calculator;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class DisplayTest {

    @Test
    public void shouldPrinttheMessage() {
        Display display = mock(Display.class);
        display.print("Maharjun");

        verify(display, times(1)).print("Maharjun");
    }
}
