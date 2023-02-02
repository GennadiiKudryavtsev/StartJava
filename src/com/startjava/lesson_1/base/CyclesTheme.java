package Users.gennadykudryavtsev.Desktop.MyCode.StartJava.src.com.startjava.lesson_1.base;

public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int counter = -10;
        int sumEvenNumbers = 0;
        int sumОddNumbers = 0;
        do {
            if (counter % 2 == 0) {
                sumEvenNumbers += counter;
            } else {
                sumОddNumbers += counter;
            }
            counter++;
        } while (counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEvenNumbers
                + ", а нечетных = " + sumОddNumbers);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = num2;
        int max = num3;
        if (num2 > num3) {
            min = num3;
            max = num2;
        }
        if (num1 < min) {
            min = num1;
        }
        if (num1 > max) {
            max = num1;
        }
        System.out.println("Максимальное число = " + max + ". Минимальное число = " + min);
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр\n");
        int num = 1234;
        int sum = 0;
        System.out.print("Исходное число: ");
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            sum += digit;
            System.out.print(digit);
        }
        System.out.println("\nСумма цифр: " + sum);
     
        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        counter = 0;
        max = 24;
        for (int i = 1; i < max; i += 2) {
            System.out.printf("%5d", i);
            counter++;
            if (counter % 5 == 0) {
                System.out.println();
                counter = 0;
            }
        }
        if (counter > 0) {
            int result = 5 - counter;
            for (int i = 1; i <= result; i++) {
                System.out.printf("%5d", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек на четность/нечетность\n");
        num = 3242592;
        int copyNum = num;
        int countTwos = 0;
        while (copyNum != 0) {
            int digit = copyNum % 10;
            copyNum /= 10;
            if (digit == 2) {
                countTwos++;
            }
        } 
        String type = " (четное) ";
        if (countTwos % 2 != 0) {
            type = " (нечетное) ";
        }
        System.out.println("Число " + num + " содержит " + countTwos + type + "количество двоек");

        System.out.println("\n6. Отображение фигур в консоли\n");
        for (int i = 1; i <= 50; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        int countColumn = 5;
        int countSymbol = 1;
        while (countColumn >= 1) {
            countSymbol = 1;
            while (countSymbol <= countColumn) {
                System.out.print("#");
                countSymbol++;
            }
            System.out.println();
            countColumn--;
        }

        System.out.println();
        countSymbol = 1;
        countColumn = 1;
        do {
            int column = 0;
            do {
                System.out.print("$");
                column++;
            } while (countSymbol > column);
            if (countColumn < 3) {
                countSymbol++;
            } else {
                countSymbol--;
            }
            countColumn++;
            System.out.println();
        } while (countColumn <= 5);

        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.printf("%6s%6s%n", "Dec", "Char");
        for (int i = 1; i <= 122; i++) {
            if (i % 2 != 0) {
                if (i <= 47) {
                    System.out.printf("%5d%5c%n", i, i);
                }
            } else if (i >= 'a' && i <= 'z') {
                System.out.printf("%5d%5c%n", i, i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        num1 = 1234321;
        num2 = num1;
        int digit = 0;
        int reverseNumber = 0;
        while (num1 != 0) {
            digit = num1 % 10;
            reverseNumber = reverseNumber * 10 + digit;
            num1 /= 10;
        }
        if (num2 == reverseNumber) {
            System.out.println("Число " + num2 + " является палиндромом");
        } else {
            System.out.println("Число " + num2 + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");
        int luckyNumber = 123321;
        int copyLuckyNumber = luckyNumber;
        counter = 1;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        int rightNum = luckyNumber % 1000;
        int leftNum = luckyNumber / 1000;
        while (copyLuckyNumber > 0) {
            if (counter > 3) {
                sumLeftHalf += copyLuckyNumber % 10;
            } else {
                sumRightHalf += copyLuckyNumber % 10;
            }
            copyLuckyNumber /= 10;
            counter++;
        }
        if (sumLeftHalf == sumRightHalf) {
            System.out.println("Число " + luckyNumber + " является счастливым");
        } else {
            System.out.println("Число " + luckyNumber + " не счастливое");
        }
        System.out.println("Сумма цифр " + leftNum + " = " + sumLeftHalf);
        System.out.println("Сумма цифр " + rightNum + " = " + sumRightHalf);

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.print("   |");
        for(int i = 2; i < 10; i++) {
            System.out.print("  " + i);
        }
        System.out.print("\n---|------------------------\n");
        for(int i = 2; i < 10; i++) {
            System.out.print(i + "  |");
            for(int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
