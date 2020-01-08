package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            String cell = array[index];
            if (cell == null) {
                int i = index;
                while(array[i] == null & i < array.length - 1) {
                    String temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    i++;
                }
            }
        }
        return array;
    }
}
