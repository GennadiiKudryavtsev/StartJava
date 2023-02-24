package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int number1;
    private int number2;
    private char operation;
    private double result = 1;

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public double calculate(String expression) {
        parseExpression(expression);
        switch (operation) {
            case '+':
                return Math.addExact(number1, number2);
            case '-':
                return Math.subtractExact(number1, number2);
            case '*':
                return Math.multiplyExact(number1, number2);
            case '/':
                return Math.floorDiv(number1, number2);
            case '^':
                return (int) Math.pow(number1, number2);
            case '%':
                return Math.floorMod(number1, number2);
        } return 0;
    }

    private void parseExpression(String expression) {
        String[] patrsExpression = expression.split(" ");
        number1 = Integer.parseInt(patrsExpression[0]);
        operation = patrsExpression[1].charAt(0);
        number2 =Integer.parseInt(patrsExpression[2]);
    }
}    
