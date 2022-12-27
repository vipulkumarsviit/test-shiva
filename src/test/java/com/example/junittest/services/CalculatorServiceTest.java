package com.example.junittest.services;

import com.example.junittest.utils.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@SpringBootTest
class CalculatorServiceTest {

    @Autowired
    private CalculatorService calculatorService;

    @MockBean
    private Calculator calculator;

    @Test
    void add() {
        when(calculator.add(anyInt(),anyInt())).thenReturn(2);
        assertEquals(2, calculatorService.add(3, 1));
        assertEquals(2, calculatorService.add(1, 1));
        assertEquals(2, calculatorService.add(4, 1));

        verify(calculator).add(3,1);
        verify(calculator).add(1,1);
        verify(calculator).add(4,1);
        verify(calculator, never()).add(4,4);
        verify(calculator, times(3)).add(anyInt(),anyInt());

    }
}