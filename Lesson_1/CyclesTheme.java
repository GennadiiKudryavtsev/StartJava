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
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность\n");
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
        num = 1234331;
        int rev = 0;
        int i = 0;
        int originalNum = num;
        while (num != 0) {
            rev = num % 10;
            i = i * 10 + rev;
            num /= 10;
        }
        if (originalNum == i) {
            System.out.println("Число " + num + " является палиндромом");
        } else {
            System.out.println("Число " + num + " не является палиндромом");
        }

        System.out.println("\n9. Определение, является ли число счастливым\n");
        num = 123111;
        num2 = num;
        int column = 1;
        int sum1 = 0;
        int sum2 = 0;
        num3 = num % 1000;
        int num4 = num / 1000;
        while (num2 != 0) {
            if (column > 3) {
                sum1 += num2 % 10;
            } else {
                sum2 += num2 % 10;
            }
            num2 /= 10;
            column++;
        }
        if (sum1 == sum2) {
            System.out.println("Число " + num + " является счастливым");
        } else {
            System.out.println("Число " + num + " не счастливое");
        }
        System.out.println("Сумма цифр " + num4 + " = " + sum1);
        System.out.println("Сумма цифр " + num3 + " = " + sum2);

        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");
        System.out.print("   |");
        for(i = 2; i < 10; i++) {
            System.out.print("  " + i);
        }
        System.out.print("\n---|------------------------\n");
        for(i = 2; i < 10; i++) {
            System.out.print(i + "  |");
            for(int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
    }
}
