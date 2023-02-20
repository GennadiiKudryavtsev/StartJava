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

    public double calculate(String input) {
        writeToArrayExpression(input);
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
                result = Math.floorDiv(number1, number2);
                break;
            case '^':
                result = (int) Math.pow(number1, number2);
                break;
            case '%':
                result = Math.floorMod(number1, number2);
                break;
        }
        return result;
    }

    private void writeToArrayExpression(String input) {
        String[] arraySplit = input.split(" ");
        number1 = Integer.parseInt(arraySplit[0]);
        operation = arraySplit[1].charAt(0);
        number2 =Integer.parseInt(arraySplit[2]);
    }
}    
