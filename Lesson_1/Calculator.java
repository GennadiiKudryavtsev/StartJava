public class Calculator {

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        int num1 = 10;
        int num2 = 90;
        char operation = '%';
        double result = 1;
        if (operation == '^') {
            for (int i = 1; i <= num2; i++) {
                result *= num1;
            }
        } else if (operation == '%') {
            result = num1 % num2;
        } else if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            result = num1 / num2;
        }
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}