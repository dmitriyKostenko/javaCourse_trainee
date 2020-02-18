package ru.job4j.collection;

import java.util.Comparator;

public class SortUserAscByAge implements Comparator<SortUser> {
    @Override
    public int compare(SortUser o1, SortUser o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
