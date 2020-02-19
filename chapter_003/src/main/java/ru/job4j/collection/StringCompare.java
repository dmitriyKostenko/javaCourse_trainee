package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        char[] first = left.toCharArray();
        char[] second = right.toCharArray();
        int rsl = 0;
        int range = Math.min(first.length, second.length);
        for (int i = 0; i != range; i++) {
            rsl = Character.compare(first[i], second[i]);
            if (rsl != 0) {
                break;
            }
        }
        if (rsl == 0) {
            rsl = Integer.compare(first.length, second.length);
        }
        return rsl;
    }
}
