package com.mods.orderservice;

import com.mods.orderservice.beans.Calculator;
import com.mods.orderservice.beans.Operation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(OutputCaptureExtension.class)
public class CalculatorMockBean {
    @MockitoBean
    private Calculator calculator;
    @MockitoBean(name ="division")
    private Operation mockOperation;

    @Test
    public void mockDivision(CapturedOutput capture) {
        when(mockOperation.handles('/')).thenReturn(true);
        when(mockOperation.apply(14, 7)).thenReturn(2);
        calculator.calculate(14, 7, '/');
        assertTrue(capture.getOut().contains("14 / 7 = 2"));
    }

    @Test
    public void mockAddition(CapturedOutput capture) {
        when(mockOperation.handles('+')).thenReturn(true);
        when(mockOperation.apply(14, 7)).thenReturn(21);
        calculator.calculate(14, 7, '+');
        assertTrue(capture.getOut().contains("14 + 7 = 21"));
    }
}
