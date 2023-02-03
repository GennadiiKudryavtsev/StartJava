package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char operation;
    private int result = 1;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate() {
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                result = firstNumber / secondNumber;
                break;
            case '^':
                for (int i = 0; i < secondNumber; i++) {
                    result *= firstNumber;
                }
                break;
            case '%':
                result = firstNumber % secondNumber;
                break;
        }
        System.out.println("Результат: " + result);
    }   
}    
