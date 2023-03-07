package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        for (int i = 0; i < coins.length; i++) {
            while (money - price >= 0) {
                money = money - price - coins[i];
                rsl[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static int[] change2(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int coin = 0;
        while (money - price > 0) {
            if (money - price < coins[coin]) {
                coin++;
            } else {
                rsl[size] = coins[coin];
                size++;
                money = money - price - coins[coin];
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static int[] change3(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int coin = 0;
        while (money - price >= coins[coin]) {
            rsl[size] = coins[coin];
            size++;
            money = money - price - coins[coin];
            if (money - price < coins[coin]) {
                coin++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}