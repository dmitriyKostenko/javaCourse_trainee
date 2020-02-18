package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
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

    @Test
    public void whenAscByName() {
        List<SortUser> users = new ArrayList<>();
        users.add(new SortUser("Petr", 32));
        users.add(new SortUser("Ivan", 31));
        users.add(new SortUser("Alex", 33));
        Collections.sort(users, new SortUserAscByName());
        assertThat(users.get(0), is(new SortUser("Alex", 33)));
    }

    @Test
    public void whenAscByAge() {
        List<SortUser> users = new ArrayList<>();
        users.add(new SortUser("Petr", 32));
        users.add(new SortUser("Ivan", 31));
        users.add(new SortUser("Alex", 33));
        Collections.sort(users, new SortUserAscByAge());
        assertThat(users.get(0), is(new SortUser("Ivan", 31)));
    }

    @Test
    public void whenDescByName() {
        List<SortUser> users = new ArrayList<>();
        users.add(new SortUser("Petr", 32));
        users.add(new SortUser("Ivan", 31));
        users.add(new SortUser("Alex", 33));
        Collections.sort(users, new SortUserDescByName());
        assertThat(users.get(0), is(new SortUser("Petr", 32)));
    }

    @Test
    public void whenDescByAge() {
        List<SortUser> users = new ArrayList<>();
        users.add(new SortUser("Petr", 32));
        users.add(new SortUser("Ivan", 31));
        users.add(new SortUser("Alex", 33));
        Collections.sort(users, new SortUserDescByAge());
        assertThat(users.get(0), is(new SortUser("Alex", 33)));
    }

    @Test
    public void whenComparatorAscByNameAndAge() {
        List<SortUser> users = new ArrayList<>();
        users.add(new SortUser("Petr", 32));
        users.add(new SortUser("Ivan", 31));
        users.add(new SortUser("Alex", 33));
        users.add(new SortUser("Alex", 30));
        Collections.sort(users, new SortUserAscByName().thenComparing(new SortUserAscByAge()));
        assertThat(users.get(0), is(new SortUser("Alex", 30)));
    }

    @Test
    public void whenComparatorAscByNameAndDescByAge() {
        List<SortUser> users = new ArrayList<>();
        users.add(new SortUser("Petr", 32));
        users.add(new SortUser("Ivan", 31));
        users.add(new SortUser("Alex", 33));
        users.add(new SortUser("Alex", 30));
        Collections.sort(users, new SortUserAscByName().thenComparing(new SortUserDescByAge()));
        assertThat(users.get(0), is(new SortUser("Alex", 33)));
    }

    @Test
    public void whenComparatorDescByNameAndAge() {
        List<SortUser> users = new ArrayList<>();
        users.add(new SortUser("Petr", 32));
        users.add(new SortUser("Ivan", 31));
        users.add(new SortUser("Alex", 33));
        users.add(new SortUser("Petr", 35));
        Collections.sort(users, new SortUserDescByName().thenComparing(new SortUserDescByAge()));
        assertThat(users.get(0), is(new SortUser("Petr", 35)));
    }

    @Test
    public void whenComparatorDescByNameAndAscByAge() {
        List<SortUser> users = new ArrayList<>();
        users.add(new SortUser("Petr", 32));
        users.add(new SortUser("Ivan", 31));
        users.add(new SortUser("Alex", 33));
        users.add(new SortUser("Petr", 35));
        Collections.sort(users, new SortUserDescByName().thenComparing(new SortUserAscByAge()));
        assertThat(users.get(0), is(new SortUser("Petr", 32)));
    }
}