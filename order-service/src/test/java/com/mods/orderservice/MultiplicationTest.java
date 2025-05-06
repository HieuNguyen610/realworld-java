package com.mods.orderservice;

import com.mods.orderservice.beans.impl.Multiplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTest {
    private final Multiplication operation = new Multiplication();

    @Test
    public void matchSign() {
        assertTrue(operation.handles('*'));
        assertFalse(operation.handles('/'));
    }

    @Test
    public void shouldCorrectlyApplyFormula() {
        assertEquals(operation.apply(2,2), 4);
        assertEquals(operation.apply(10, 10), 100);
    }
}
