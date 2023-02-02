package Users.gennadykudryavtsev.Desktop.MyCode.StartJava.src.com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
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
            calculator.countingMathExpression();
            calculator.setUserResponse(scanner.nextLine());
            while (!calculator.getUserResponse().equals("yes")) {
                if (calculator.getUserResponse().equals("no")) {
                    answer = calculator.getUserResponse();
                    break;
                } else {
                    System.out.println("Хотите продолжить вычисления? [yes/no]: O_O 2");
                    calculator.setUserResponse(scanner.nextLine());
                }
            }
        }
    }
}