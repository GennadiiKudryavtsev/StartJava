package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String userResponse;
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        while (!answer.equals("no")) {
            System.out.println("Введите первое число: ");
            calculator.setFirstNumber(scanner.nextInt());
            System.out.println("Введите знак математической операции: ");
            calculator.setOperation(scanner.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setSecondNumber(scanner.nextInt());
            calculator.calculate();
            userResponse = scanner.nextLine();
            while (!userResponse.equals("yes")) {
                if (userResponse.equals("no")) {
                    answer = userResponse;
                    break;
                }
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                userResponse = scanner.nextLine();
            }
        }
    }
}