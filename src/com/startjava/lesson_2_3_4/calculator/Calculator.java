package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int number1;
    private int number2;
    private char operation;
    private double result = 1;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int getNumber2() {
        return number2;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }
    public char getOperation() {
        return operation;
    }

    public double calculate() {
        switch (operation) {
            case '+':
                result = Math.addExact(number1, number2);
                break;
            case '-':
                result = Math.subtractExact(number1, number2);
                break;
            case '*':
                result = Math.multiplyExact(number1, number2);
                break;
            case '/':
                result = (double) number1 / number2;
                break;
            case '^':
                result = (int) Math.pow(number1, number2);
                break;
            case '%':
                result = number1 % number2;
                break;
        }
        return result;
    }
}    
