package ru.job4j.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SortUserTest {
    @Test
    public void whenAsc() {
        Set<SortUser> users = new TreeSet<>();
        users.add(new SortUser("Petr", 32));
        users.add(new SortUser("Ivan", 31));
        Iterator<SortUser> it = users.iterator();
        assertThat(it.next(), is(new SortUser("Ivan", 31)));
        assertThat(it.next(), is(new SortUser("Petr", 32)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new SortUser("Petr", 32)
                .compareTo(
                        new SortUser("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }
}