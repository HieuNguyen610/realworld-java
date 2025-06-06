package com.mods.orderservice;

import com.mods.orderservice.beans.Calculator;
import com.mods.orderservice.beans.Operation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.anyChar;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    private Calculator calculator;
    private Operation operation;

    @BeforeEach
    public void setup() {
        operation = Mockito.mock(Operation.class);
        calculator = new Calculator(Collections.singletonList(operation));
    }

    @Test
    public void throwExceptionWhenNoSuitableOperationFound() {
        when(operation.handles(anyChar())).thenReturn(false);
        assertThrows(IllegalArgumentException.class,
                () -> calculator.calculate(2, 2, '*'));
    }
    @Test
    public void shouldCallApplyMethodWhenSuitableOperationFound() {
        when(operation.handles(anyChar())).thenReturn(true);
        when(operation.apply(2, 2)).thenReturn(4);
        calculator.calculate(2, 2, '*');
        verify(operation, times(1)).apply(2, 2);
    }
}
