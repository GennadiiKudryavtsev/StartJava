package Users.gennadykudryavtsev.Desktop.MyCode.StartJava.src.com.startjava.lesson_1.final;

public class GuessNumber {

    public static void main(String[] args) {
        System.out.println("Игра “Угадай число”\n");
        int inputNumber = 95;
        int computerNumber = 70;
        System.out.println("Угадайте число от 1 до 100\n");
        while (computerNumber >= 1 && computerNumber <= 100) {
            System.out.println("Ваше число " + inputNumber);
            if (inputNumber == computerNumber) {
                System.out.println("Вы победили!");
                break;
            } 
            if (inputNumber < 1 || inputNumber > 100) {
                System.out.println("Вы ввели число за рамками диапазона от 0 до 100");
                break;
            } 
            if (inputNumber > computerNumber) {
                System.out.println("Число " + inputNumber 
                    + " больше того, что загадал компьютер\n");
                inputNumber--;
            } else {
                System.out.println("Число " + inputNumber 
                    + " меньше того, что загадал компьютер\n");
                inputNumber++;
            }
        }
    }
}