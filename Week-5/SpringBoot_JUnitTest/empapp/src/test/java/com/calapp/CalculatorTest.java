package com.calapp;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)       //this is class level annotation which has another method level annotation
class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("this @BeforeAll annotation must place on static method");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("this @AfterAll annotation must place on static method");
    }
    @BeforeEach
    public void before(){
        System.out.println("Before ");
        calculator = new Calculator();
    }

    @Order(value = 2)
    @DisplayName("Addition test")
    @Test
    void addTest() {
        System.out.println("Add test");
//        Assertions.assertEquals(4, calculator.add(2, 2));
        assertEquals(4, calculator.add(2, 2));      //import is static, no need to write class name i.e.(Assertions)
    }

    @DisplayName("disabled test2")
    @Disabled
    @Test
    void addTest2() {
        System.out.println("this method will disabled and will not going to execute");
//        Assertions.assertEquals(4, calculator.add(2, 2));
        assertEquals(4, calculator.add(2, 2));
    }

//    @EnabledOnJre(JRE.JAVA_8)       //this test will execute only on java 8
//    @EnabledOnOs(OS.LINUX)            // this test will execute only on linux os
    @Order(value = 1)
    @DisplayName("Multiplication test")
    @Test
    void multiplyTest() {
        System.out.println("mult test");
        Assertions.assertEquals(4, calculator.multiply(2, 2));
    }

    @AfterEach
    public void after(){
        System.out.println("After");
        calculator = null;
    }

}