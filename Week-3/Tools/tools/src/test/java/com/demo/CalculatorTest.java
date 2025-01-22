package com.demo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator = null;

    @BeforeEach
    public void before(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("add test")
    public void addTest(){
        int result = calculator.add(1, 2);
        assertEquals(3, result);
    }
}
