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
            alphabet[i] = (char) ('Z' - i);
        }
        int countIndex = 0;
        for (int j = alphabet.length; j > 0 ; j--) {
            countIndex++;
            for (int k = 0; k < countIndex; k++) {
                System.out.print(alphabet[k]);
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
        printIntArray(intArr);

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
        printStringArray(stringArr);
        printStringArrayCopy(stringArrCopy);
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

    private static void printStringArrayCopy(String[] stringArrCopy) {
        for (String s : stringArrCopy) {
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