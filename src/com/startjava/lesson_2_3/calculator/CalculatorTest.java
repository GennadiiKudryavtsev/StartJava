package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String userResponse = "yes";
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while (!userResponse.equals("no")) {
            System.out.println("Введите первое число: ");
            calculator.setNumber1(scanner.nextInt());
            System.out.println("Введите знак математической операции: ");
            calculator.setOperation(scanner.next().charAt(0));
            System.out.println("Введите второе число: ");
            calculator.setNumber2(scanner.nextInt());
            calculator.calculate();
            userResponse = scanner.nextLine();
            while (!userResponse.equals("yes")) {
                if (userResponse.equals("no")) {
                    break;
                }
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                userResponse = scanner.nextLine();
            }
        }
    }
}