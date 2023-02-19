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
                String[] arraySplit = input.split(" ");
                calculator.setNumber1(Integer.parseInt(arraySplit[0]));
                calculator.setOperation(arraySplit[1].charAt(0));
                calculator.setNumber2(Integer.parseInt(arraySplit[2]));
                if (calculator.calculate() == 0.0) {
                    System.out.println((int) calculator.calculate());
                } else {
                    System.out.println("Результат: " + calculator.calculate());
                }
            }
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            userResponse = scanner.nextLine();
            if (userResponse.equals("no")) {
                break;
            }
        } while (!userResponse.equals("no"));
    }
}