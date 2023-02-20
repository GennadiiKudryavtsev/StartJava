package com.startjava.lesson_2_3_4.array;

import java.util.*;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] intArr = {3, 2, 5, 7, 1, 6, 4};
        int length = intArr.length;
        System.out.println("Исходный массив");
        printIntArray(intArr);
        for (int i = 0; i < length; i++) {
            int temp = intArr[i];
            intArr[i] = intArr[--length];
            intArr[length] = temp;
        }
        System.out.println("\n\nИзмененный массив");
        printIntArray(intArr);

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
        for (int i = 0; i < length; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив ");
        printDoubleArray(doubleArr);
        int count = 0;
        double middleCellValue = doubleArr[length / 2];
        System.out.println("\nИзмененный массив ");
        for (int i = 0; i < length; i++) {
            if (doubleArr[i] > middleCellValue) {
                doubleArr[i] = 0;
                count++;
            }
        }
        printDoubleArray(doubleArr);
        System.out.println("\nКоличество обнуленных ячеек - " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        length = 26;
        char[] alphabet = new char[length];

        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet[length - 1 - j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Генерация уникальных чисел");
        intArr = new int[30];
        length = intArr.length;
        for (int i = 0; i < length; i++) {
            boolean uniqueNumber = true;
            int randomNumber = (int) (60 + Math.random() * 40);
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    continue;
                }
                if (intArr[j] == randomNumber) {
                    uniqueNumber = false;
                    i--;
                    break;
                }
            }
            if (uniqueNumber) {
                intArr[i] = randomNumber;
            }
        }
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (intArr[j] < intArr[i]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[i] = temp;
                }
            }
        }
        printIntArray(intArr);

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] srcStrings = new String[] {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        length = srcStrings.length;
        int countNotBlankStrings = 0;
        for (String s : srcStrings) {
            if (s.isBlank()) {
                countNotBlankStrings++;
            }
        }
        String[] destStrings = new String[length - countNotBlankStrings];
        int countSymbols = 0;
        int srcPos = 0;
        int destPos = 0;
        for (int i = 0; i < length; i++) {
            if (srcStrings[i].isBlank()) {
                if (countSymbols > 0) {
                    System.arraycopy(srcStrings, srcPos, destStrings, destPos, countSymbols);
                }
                destPos += countSymbols;
                countSymbols = 0;
                srcPos = i + 1;
            } else {
                countSymbols++;
            }
        }
        printStringArray(srcStrings);
        printStringArrayCopy(destStrings);
    }
    private static void printIntArray(int[] intArr) {
        for (int i : intArr) {
            System.out.print(i + " ");
        }
    }

    private static void printDoubleArray(double[] doubleArray) {
        int length = doubleArray.length;
        for (int i = 0; i < length; i++) {
            System.out.printf("%.3f ", doubleArray[i]);
            if (i == 7) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static void printStringArrayCopy(String[] destStrings) {
        for (String s : destStrings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] stringArr) {
        for (String s : stringArr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}