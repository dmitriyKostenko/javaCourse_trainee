package ru.job4j.collection;

import java.util.Comparator;

public class SortUserAscByName implements Comparator<SortUser> {
    @Override
    public int compare(SortUser o1, SortUser o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
