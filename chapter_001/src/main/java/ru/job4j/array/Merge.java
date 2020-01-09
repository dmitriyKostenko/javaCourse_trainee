package ru.job4j.array;

public class Merge {
    public int[] merge(int[] left, int[]right) {
        int[] rsl = new int[left.length + right.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (index != rsl.length) {
            if ((i < left.length) && (left[i] <= right[j])) {
                rsl[index] = left[i];
                i++;
            } else {
                rsl[index] = right[j];
                j++;
            }
            index++;
        }
        return rsl;
    }
}
