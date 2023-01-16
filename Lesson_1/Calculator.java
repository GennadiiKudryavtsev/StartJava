public class Calculator {

    public static void main(String[] args) {
        System.out.println("Калькулятор");
        int num1 = 9;
        int num2 = 5;
        int degree = 3;
        char operation = '%';
        int result = 1;
        if (operation == '^') {
            for (int i = 1; i <= degree; i++) {
                result = result * num1;
            }
            System.out.println("Число " + num1 + " возведенное в степень ^ " + degree 
                + " = " + result);
        } else if (operation == '%') {
            System.out.println("Процент от числа " + num1 + " = " + (double) num1 / 100);
        } else if (operation == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        } else if (operation == '/') {
            System.out.println(num1 + " / " + num2 + " = " + ((double) num1 / (double) num2));
        } else {
            System.err.println("Вы ввели некорректный оператор");
        }
    }
}