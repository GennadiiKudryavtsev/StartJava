package com.startjava.lesson_2_3_4.array;

import java.util.*;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {3, 2, 5, 7, 1, 6, 4};
        int length = intArr.length;
        for (int outputArr : intArr) {
            System.out.print(outputArr + " ");
        }
        System.out.println();
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (intArr[j] < intArr[j + 1]) {
                   int temp = intArr[j + 1];
                    intArr[j + 1] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
        for (int outputArr : intArr) {
            System.out.print(outputArr + " ");
        }

        System.out.println("\n\n2. Вывод произведения элементов массива");
        intArr = new int[10];
        length = intArr.length;
        for (int i = 0; i < length; i++) {
            intArr[i] = i;
        }
        int productNumbers = 1;
        for (int i = 1; i < length - 1; i++) {
            productNumbers *= intArr[i];
            System.out.print(intArr[i] + ((i != length - 2) ? " * " : " = " + productNumbers));
        }
        System.out.println("\nПод индексом 0, значение " + intArr[0] + "\nИндекс 9 равен " + intArr[9]);

        System.out.println("\n3. Удаление элементов массива");
        double[] doubleArr = new double[15];
        length = doubleArr.length;
        double average = 0;
        int count = 0;
        System.out.println("Исходный массив:");
        for (int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
            average += doubleArr[i];
        }
        average = average / length;
        for (int i = 0; i < 8; i++) {
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
        length = 26;
        char[] alphabet = new char[length];
        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= i; j--) {
                if (j >= i) {
                    System.out.print(alphabet[j]);
                } else {
                    break;
                }
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        length = intArr.length;
        for (int i = 0; i < length; i++) {
            intArr[i] = 60 + (int) (Math.random() * 40);
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    continue;
                }
                if (intArr[i] == intArr[j]) {
                    i--;
                    break;
                }
            }
        }
        for (int outputArr : intArr) {
            System.out.print(outputArr + " ");
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] stringArr = new String[] {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        length = stringArr.length;
        int countRemoveIndex = 0;
        for (int i = 0; i < length; i++) {
            if (stringArr[i].isBlank()) {
                countRemoveIndex++;
            }
        }
        String[] stringArrCopy = new String[length - countRemoveIndex];
        int countSymbols = 0;
        int stringArrIndex = 0;
        int stringArrCopyIndex = 0;
        for (int i = 0; i < length; i++) {
            if (stringArr[i].isBlank()) {
                System.arraycopy(stringArr, stringArrIndex, stringArrCopy, stringArrCopyIndex, countSymbols);
                stringArrCopyIndex += countSymbols;
                countSymbols = 0;
                stringArrIndex = i + 1;
            } else {
                countSymbols++;
            }
        }
        System.out.println(Arrays.toString(stringArr));
        System.out.println(Arrays.toString(stringArrCopy));
    }
}