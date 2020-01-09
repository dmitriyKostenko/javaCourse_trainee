package ru.job4j.array;

public class Merge {
    public int[] merge(int[] left, int[]right) {
        int[] rsl = new int[left.length + right.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (index < rsl.length) {
            while ((i < left.length) && (j < right.length)) {
                rsl[index++] = left[i] < right[j] ? left[i++] : right[j++];
            }
            if (i < left.length) {
                rsl[index++] = left[i++];
            } else if (j < right.length) {
                rsl[index++] = right[j++];
            }
        }
        return rsl;
    }
}
