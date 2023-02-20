package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String userResponse = "yes";
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            if (userResponse.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String input = scanner.nextLine();
                calculator.calculate(input);
                if (calculator.calculate(input) == 0.0) {
                    System.out.println((int) calculator.calculate(input));
                } else {
                    System.out.println("Результат: " + calculator.calculate(input));
                }
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            userResponse = scanner.nextLine();
        } while (!userResponse.equals("no"));
    }
}