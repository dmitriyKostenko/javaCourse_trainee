package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int dif = money - price;
        while (dif > 0) {
            for (int index = 0; index < coins.length;) {
                if (dif >= coins[index]) {
                    dif -= coins[index];
                    rsl[size++] = coins[index];
                } else {
                    index++;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
