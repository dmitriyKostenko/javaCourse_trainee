package ru.job4j.oop;

public class Jukebox {

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox player = new Jukebox();
        int position = 1;
        player.music(position);
        position = 2;
        player.music(position);
        position = 3;
        player.music(position);
    }
}
