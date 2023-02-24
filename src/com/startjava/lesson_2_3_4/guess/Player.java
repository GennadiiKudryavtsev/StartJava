package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] enteredNums = new int[10];
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

    public void addEnteredNums(int enteredNum) {
        enteredNums[attempt] = enteredNum;
        attempt++;
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(enteredNums, attempt);
    }

    public void clearAttempts() {
        Arrays.fill(enteredNums, 0, attempt,  0);
        attempt = 0;
    }

    public int getLastEnteredNums() {
        return enteredNums[attempt - 1];
    }
}