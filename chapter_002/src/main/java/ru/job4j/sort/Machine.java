package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int dif = money - price;
        while (dif > 0) {
            for (int index = 0; index < COINS.length;) {
                if (dif >= COINS[index]) {
                    dif -= COINS[index];
                    rsl[size++] = COINS[index];
                } else {
                    index++;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
