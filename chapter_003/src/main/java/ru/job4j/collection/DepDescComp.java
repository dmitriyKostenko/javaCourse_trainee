package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int len1 = o1.length();
        int len2 = o2.length();
        int range = Math.min(len1, len2);
        for (int i = 0; i != range; i++) {
            int o1Char = o1.charAt(i);
            int o2Char = o2.charAt(i);
            if (o1Char != o2Char) {
                return o2Char - o1Char;
            }
        }
        if (len1 != len2) {
            return Integer.compare(len1, len2);
        } else {
            return 0;
        }
    }
}