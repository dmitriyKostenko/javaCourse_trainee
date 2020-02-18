package ru.job4j.collection;

import java.util.Comparator;

public class SortUserDescByAge implements Comparator<SortUser> {
    @Override
    public int compare(SortUser o1, SortUser o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
