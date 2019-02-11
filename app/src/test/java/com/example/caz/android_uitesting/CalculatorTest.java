package com.example.caz.android_uitesting;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculatorTest = new Calculator();

    @Test
    public void doesAdditionWork() {
        // setup
        String firstNum = "2";
        String secondNum = "3";
        String additionSign = "+";

        // execution
        calculatorTest.inputFirstNumber(firstNum);          // inputFirstNumber - name of method that accepts first number
        calculatorTest.inputSecondNumber(secondNum);        // inputSecondNumber - name of method that takes second number
        calculatorTest.inputSign(additionSign);             // inputSign - name of method that takes symbol
        String answer = calculatorTest.addStuff();          // addStuff - name of method to add things

        // check
        assertEquals("5", answer);                 // first parameter must equal second parameter to pass
    }

    @Test
    public void doesSubtractionWork() {
        // setup
        String firstNum = "7";
        String secondNum = "5";
        String subtractionSign = "-";

        // execution
        calculatorTest.inputFirstNumber(firstNum);
        calculatorTest.inputSecondNumber(secondNum);
        calculatorTest.inputSign(subtractionSign);
        String answer = calculatorTest.subtractStuff();

        // check
        assertEquals("2", answer);
    }

    @Test
    public void doesMultiplicationWork() {
        // setup
        String firstNum = "4";
        String secondNum = "3";
        String multiplySign = "*";

        // execution
        calculatorTest.inputFirstNumber(firstNum);
        calculatorTest.inputSecondNumber(secondNum);
        calculatorTest.inputSign(multiplySign);
        String answer = calculatorTest.multiplyStuff();

        // check
        assertEquals("12", answer);
    }

    @Test
    public void doesDivisionWork() {
        // setup
        String firstNum = "20";
        String secondNum = "5";
        String divideSign = "/";

        // execution
        calculatorTest.inputFirstNumber(firstNum);
        calculatorTest.inputSecondNumber(secondNum);
        calculatorTest.inputSign(divideSign);
        String answer = calculatorTest.divideStuff();

        // check
        assertEquals("4", answer);
    }

}