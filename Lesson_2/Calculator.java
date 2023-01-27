import java.util.Scanner;

public class Calculator {

    private int firstNumber;
    private int secondNumber;
    private char operation;
    private int result = 1;
    private String userResponse;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setNickname(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public String getUserResponse() {
        return userResponse;
    }

    public void setUserResponse(String userResponse) {
        this.userResponse = userResponse;
    }       

    public  void mathExpressionCalculator() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        firstNumber = scanner.nextInt();
        System.out.println("Введите знак математической операции: ");
        operation = scanner.next().charAt(0);
        System.out.println("Введите второе число: ");
        secondNumber = scanner.nextInt();

        switch(operation)
        {
        case '+':
            result = firstNumber + secondNumber;
            System.out.println("Результат: " + result);
            break;
        case '-':
            result = firstNumber - secondNumber;
            System.out.println("Результат: " + result);
            break;
        case '*':
            result = firstNumber * secondNumber;
            System.out.println("Результат: " + result);
            break;
        case '/':
            result = firstNumber / secondNumber;
            System.out.println("Результат: " + result);
            break;
        case '^':
            for (int i = 0; i < secondNumber; i++) {
                result *= firstNumber;
            }
            System.out.println("Результат: " + result);
            break;
        case '%':
                result = firstNumber % secondNumber;
                System.out.println("Результат: " + result);
            break;
        }
    }   
}    
