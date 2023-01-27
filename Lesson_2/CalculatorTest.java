import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        while(true) {
            calculator.mathExpressionCalculator();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            calculator.setUserResponse(scanner.nextLine());
            while(!calculator.getUserResponse().equals("yes")) {
                if (calculator.getUserResponse().equals("yes")) {
                    calculator.mathExpressionCalculator();
                } else if (calculator.getUserResponse().equals("no")) {
                    System.exit(0);
                } else {
                    System.out.println("Хотите продолжить вычисления? [yes/no]:");
                    calculator.setUserResponse(scanner.nextLine());
                }
            }
        }
    }
}