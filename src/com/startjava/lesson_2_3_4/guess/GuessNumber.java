package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        secretNum = ((int) (1 + Math.random() * 100));
        System.out.println("Загадано число от 0 по 100, угадайте число");
        player1.clearAttempts();
        player2.clearAttempts();
        while (true) {
            if (isGuessed(player1) || isGuessed(player2)) {
                break;
            }
            if (player1.getAttempt() == 10 && player2.getAttempt() == 10) {
                break;
            }
        }
        printEnteredNums(player1);
        printEnteredNums(player2);
    }

    private boolean isGuessed(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Игрок " + player.getName() + " введите число: ");
        player.addEnteredNum(scanner.nextInt());
        int enteredNum = player.getLastEnteredNum();
        if (enteredNum == secretNum) {
            System.out.println("Игрок " + player.getName() + " угадал число: " + secretNum + " с "
                    + player.getAttempt() + " попытки");
            return true;
        }
        if (enteredNum > secretNum) {
            System.out.println("Число " + enteredNum + " больше того, что загадал компьютер");
        } else {
            System.out.println("Число " + enteredNum + " меньше того, что загадал компьютер");
        }
        if (player.getAttempt() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private void printEnteredNums(Player player) {
        System.out.print("Игрок " + player.getName() + " вводил числа: ");
        int[] enteredNums = player.getEnteredNum();
        for (int num : enteredNums) {
            System.out.printf("%1d %s", num, " ");
        }
        System.out.println();
    }
}