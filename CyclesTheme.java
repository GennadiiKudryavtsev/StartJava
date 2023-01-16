public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел\n");
        int counter = -10;
        int evenNumbersSum = 0;
        int oddNumbersSum = 0;
        do {
            if (counter % 2== 0) {
                evenNumbersSum += counter;
            } else {
                oddNumbersSum += counter;
            }
            counter++;
        } while(counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + evenNumbersSum 
                + ", а нечетных = " + oddNumbersSum);
        System.out.println();

        System.out.println("2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = 0;
        int average = 0;
        int min = 0;
        for (int i = -1; i <= 10; i++) {
            if (i == num3) {
                min = i;
            } else if (i == num2) {
                average = i;
            } else if (i == num1) {
                max = i;
            }
        }
        System.out.println(max + ", " + average + ", " + min);
         
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр\n");
        int digit = 1234;
        int sum = 0;
        System.out.print("Исходное число: ");
        while (digit != 0) {
            num2 = digit % 10;
            digit /= 10;
            sum += num2;
            System.out.print(num2);
        }
        System.out.println("\nСумма цифр: " + sum);
     
        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");
        int count = 0;
        for (int i = 1; i < 31; i += 2) {
            if (i < 24) {
                System.out.printf("%5d", i);
            } else {
                System.out.printf("%5d", 0);
            }   
            count++;
            if (count % 5 == 0) {
                System.out.println();
             }
        } 

        System.out.println("\n5. Проверка количества двоек на четность/нечетность\n");
        int num = 3242592;
        int copyNum = num;
        int countTwos = 0;
        while (copyNum != 0) {
            digit = copyNum % 10;
            copyNum /= 10;
            if (digit == 2) {
                countTwos++;
            }
        } 
        if (countTwos % 2 == 0) {
            System.out.println("Значение " + num + " имеет " + countTwos 
                + " (четное) количество двоек");
        } else {
            System.out.println("Число " + num + " содержит " + countTwos 
                + " (нечетное) количество двоек");
        }

        System.out.println("\n6. Отображение фигур в консоли\n");
        for (int i = 1; i <= 50; i++) { // квадрат
            System.out.print("*");
            if (i % 10 == 0) {
                System.out.print("\n");
            } 
        }
        System.out.println(); // прямоугольный треугольник
        int n = 5;
        int i = n;
        while (i >= 1) {
        int j = 1;
            while (j <= i) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            i--;
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
        System.out.println("Dec");
        for (i = 33; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%5c", (char) i);
                System.out.println();
            } 
        }
        System.out.println("\n" + "Char");
        for (i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%5c", (char) i);
                System.out.println();
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом\n");
        num = 1234331;
        int rev = 0;
        i = 0;
        int originalNum = num;
        while (num != 0) {
            rev = num % 10;
            i = i * 10 + rev;
            num = num / 10;
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
