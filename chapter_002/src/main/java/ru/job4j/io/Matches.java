package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 11;
        boolean run = true;
        System.out.println("Игра 11.");
        System.out.println("На столе лежат 11 спичек. Два игрока по очереди берут от 1 до 3 спичек. Выигрывает тот, кто забрал последние спички.");
        while (run) {
            System.out.print("Введите количесвто спичек от 1 до 3: ");
            int select = Integer.valueOf(input.nextLine());
            balance = balance - select;
            if (balance == 0) {
                System.out.println("Поздравляем, вы выиграли!");
                run = false;
            } else {
                System.out.println("На столе осталось " + balance + " спичек.");
            }
            System.out.println();
        }
    }
}
