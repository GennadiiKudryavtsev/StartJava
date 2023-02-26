package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] num = new int[10];
    private int attempt;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempt() {
        return attempt;
    }

    public void addEnteredNum(int enteredNum) {
        num[attempt] = enteredNum;
        attempt++;
    }

    public int[] getEnteredNum() {
        return Arrays.copyOf(num, attempt);
    }

    public void clearAttempts() {
        Arrays.fill(num, 0, attempt,  0);
        attempt = 0;
    }

    public int getLastEnteredNum() {
        return num[attempt - 1];
    }
}