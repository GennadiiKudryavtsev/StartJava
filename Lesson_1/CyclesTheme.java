public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int counter = -10;
        int sumEvenNumbers = 0;
        int sumОddNumbers = 0;
        do {
            if (counter % 2== 0) {
                sumEvenNumbers += counter;
            } else {
                sumОddNumbers += counter;
            }
            counter++;
        } while(counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEvenNumbers
                + ", а нечетных = " + sumОddNumbers);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        if (num2 > num3) {
            int num4 = num2;
            num2 = num3;
            num3 = num4;
        }
        if (num1 > num3) {
            int num4 = num1;
            num1 = num3;
            num3 = num4;
        }
        if (num1 > num2) {
            int num4 = num1;
            num1 = num2;
            num2 = num4;
        }
        int max = num3;
        int average = num2;
        int min = num1;
        System.out.println("Максимальное число = " + max + ". Минимальное число = " + min);
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр\n");
        num2 = 1234;
        int sum = 0;
        System.out.print("Исходное число: ");
        while (num2 > 0) {
            int digit = num2 % 10;
            num2 /= 10;
            sum += digit;
            System.out.print(digit);
        }
        System.out.println("\nСумма цифр: " + sum);
     
        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        counter = 0;
        max = 24;
        for (int i = 1; i < max; i += 2) {
            if (i < max) {
                System.out.printf("%5d", i);
            }
            counter++;
            if (counter % 5 == 0) {
                System.out.println();
                counter = 0;
            }
        }
        if (counter != 0) {
            int result = 5 - counter;
            for (int j = 1; j <= result; j++) {
                System.out.printf("%5d", 0);
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек на четность/нечетность\n");
        int num = 3242592;
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
        System.out.printf("Число " + num + " содержит " + countTwos + type + "количество двоек\n");

        System.out.println("\n6. Отображение фигур в консоли\n");
        for (int i = 1; i <= 50; i++) {
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println();
        int maxСolumn = 5;
        while (maxСolumn >= 1) {
            int line = 1;
            while (line <= maxСolumn) {
                System.out.print("#");
                line++;
            }
            System.out.println();
            maxСolumn--;
        }

        System.out.println();
        int line = 1;
        int maxLine = 1;
        int column = 0;
        do {
            column = 0;
            do {
                System.out.print("$");
                column++;
            } while (line > column);
            if (maxLine < 3) {
                line++;
            } else {
                line--;
            }
            maxLine++;
            System.out.println();
        } while (maxLine <= 5);

        System.out.println("\n7. Отображение ASCII-символов\n");
        System.out.printf("%6s%6s%n", "Dec", "Char");
        for (int i = 33; i <= 122; i++) {
            if (i >= 48 && i <= 96) {
                continue;
            } else if (i % 2 == 0) {
                if (i >= 'a' && i <= 'z') {
                    System.out.printf("%5d%5c%n", i, i);
                }
            } else if (i <= 47) {
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
        column = 1;
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
