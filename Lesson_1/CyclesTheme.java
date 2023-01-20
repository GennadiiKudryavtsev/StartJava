public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int counter = -10;
        int sumEvensNumbers = 0;
        int sumОddNumbers = 0;
        do {
            if (counter % 2== 0) {
                sumEvensNumbers += counter;
            } else {
                sumОddNumbers += counter;
            }
            counter++;
        } while(counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEvensNumbers
                + ", а нечетных = " + sumОddNumbers);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 4;
        int num2 = 5;
        int num3 = 12;
        int max;
        int min;
        int averageNumber;
        if (num1 > num2 && num2 > num3) {
            max = num1;
            averageNumber = num2;
            min = num3;
        } else if (num1 > num3 && num3 > num2) {
            max = num1;
            averageNumber = num3;
            min = num2;
        } else if (num2 > num1 && num1 > num3) {
            max = num2;
            averageNumber = num1;
            min = num3;
        } else if (num2 > num3 && num3 > num1) {
            max = num2;
            averageNumber = num3;
            min = num1;
        } else if (num3 > num1 && num1 > num2) {
            max = num3;
            averageNumber = num1;
            min = num2;
        } else {
            max = num3;
            averageNumber = num2;
            min = num1;
        }
        System.out.println("Число " + max + " является " + min + "\n");
        int intervalNum;
        for(int i = max; i > min; i--) {
            if(i > averageNumber && i < max) {
                intervalNum = --max;
                System.out.print(intervalNum);
           } else if (i > min && i < averageNumber) {
               intervalNum = --num2;;
               System.out.print(intervalNum);
            } 
        }

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
        int count5 = 0;   // счетчик итераций на 5. Должен проходить 5 раз и обнуляться
        int countI = 0;   // счетчик итераций i
        int maxNum = 24;  // проверка на 31 прошла успешно, также проверял другие значения
        for (int i = 1; i < maxNum; i += 2) {
            countI = i;
            if (i < maxNum) {
                System.out.printf("%5d", i);
            }
            count5++;
            if (count5 % 5 == 0) {
                System.out.println("\n"); // добавил /n  чтоб смотрелось красиво
                count5 = 0;
            }
        }
        if (count5 != 0) {
            int result = 5 - count5;
            for ( int j = 1; j <= result; j++) {
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
        for (int i = 1; i <= 50; i++) { // квадрат
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.println();
            } 
        }

        System.out.println(); // прямоугольный треугольник
        num = 5;
        while (num >= 1) {
            int count1 = 1;
            while (count1 <= num) {
                System.out.print("#");
                count1++;
            }
            System.out.println();
            num--;
        }

        System.out.println();
        int counter1 = 1; // треугольник
        int counter2 = 0;
        int counter3 = 0;
        do {
            counter3 = 0;
            do {
                System.out.print("$");
                counter3++;
            } while (counter1 > counter3);
            if (counter2 < 2) {
                counter1++;
            } else {
                counter1--;
            }
            counter2++;
            System.out.println();
        } while (counter2 < 5);

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
