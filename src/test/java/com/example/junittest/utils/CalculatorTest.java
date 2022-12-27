package com.example.junittest.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    void add() {
        int sum = calculator.add(1, 1);
        assertEquals(2, sum);
    }

    @Test
    void multiply() {
        assertEquals(1, calculator.multiply(1, 1));
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void divide() {
        assertEquals(1, calculator.divide(1, 1));
        assertEquals(2, calculator.divide(6, 3));

        assertThrows(IllegalArgumentException.class, () -> calculator.divide(3, 0));
    }

}