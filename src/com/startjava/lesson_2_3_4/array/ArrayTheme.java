package com.startjava.lesson_2_3_4.array;

import java.util.*;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {3, 2, 5, 7, 1, 6, 4};
        for (int arr : intArr) {
            System.out.print(arr);
        }
        System.out.println();
        for (int i = intArr.length - 1; i >= 0; i --) {
            System.out.print(intArr[i]);
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        for (int i = 0; i <= 9; i++) {
            intArr[i] = i;
        }
        int sum = 1;
        for (int i = 1; i < intArr.length - 1; i++) {
            sum = sum * intArr[i];
        }
        int sum2 = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8;
        String securitySum = sum == sum2 ? "1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 = " + sum : "Ошибка вычислений";
        System.out.println(securitySum);
        System.out.println("Под индексом 0, значение " + intArr[0] + "\nИндекс 9 равен " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        double average = 0;
        int count = 0;
        System.out.println("Исходный массив:");
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = Math.random();
            average += i;
        }
        average = average / doubleArr.length;
        for (int i = 0; i < 9; i++) {
            System.out.printf("%7.3f", doubleArr[i]);
        }
        System.out.println("\nИзмененный массив:");
        for (int i = 0; i < 7; i++) {
            if (doubleArr[i] > doubleArr[(int) average]) {
                doubleArr[i] = 0;
                count++;
            }
            System.out.printf("%7.3f", doubleArr[i]);
        }
        System.out.println("\nКоличество обнуленных ячеек: " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        String[] stringArr = new String[] {"Z", "Y", "X", "W", "V", "U", "T", "S", "R", "Q", "P", "O", "N", "M", "L", "K",
                "J", "I", "H", "G", "F", "E", "D", "C", "B", "A"};
        int countIndex = 0;
            for (int i = 0; i < stringArr.length; i++) {
                countIndex++;
                for (int j = 0; j < countIndex; j++) {
                    System.out.print(stringArr[j]);
                }
                System.out.println();
            }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = 60 + (int) (Math.random() * 40);
            for (int j = 0; j < intArr.length; j++) {
                if (i == j) {
                    continue;
                }
                if (intArr[i] == intArr[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int arr : intArr) {
            System.out.print(arr + " ");
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        stringArr = new String[] {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        String[] stringArrCopy = new String[stringArr.length - 4];
        System.arraycopy(stringArr, 1, stringArrCopy, 0, 1);
        System.arraycopy(stringArr, 3, stringArrCopy, 1, 3);
        System.arraycopy(stringArr, 7, stringArrCopy, 4, 3);
        System.out.println(Arrays.toString(stringArr));
        System.out.println(Arrays.toString(stringArrCopy));
    }
}
