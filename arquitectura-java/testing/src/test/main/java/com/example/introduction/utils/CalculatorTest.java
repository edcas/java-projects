package com.example.introduction.utils;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Add two numbers")
    void sum() {
        double result = calculator.sum(2, 2);

        assertEquals(4, result);
    }

    @Test
    @DisplayName("Subtract two numbers")
    void subtract() {
        double result = calculator.subtract(4, 2);

        assertEquals(2, result);
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        double result = calculator.multiply(2, 2);

        assertEquals(4, result);
    }

    @Test
    @DisplayName("Divide two numbers")
    void divide() {
        double result = calculator.divide(4, 2);

        assertEquals(2, result);
    }
}