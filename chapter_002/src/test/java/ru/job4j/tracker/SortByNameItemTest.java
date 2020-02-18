package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortByNameItemTest {
    @Test
    public void whenSortByNaturalOrder() {
        List<Item> items = Arrays.asList(
                new Item("third"),
                new Item("first"),
                new Item("second")
        );
        Collections.sort(items);
        assertThat(items.get(0).toString(), is("first"));
    }

    @Test
    public void whenSortByReverseOrder() {
        List<Item> items = Arrays.asList(
                new Item("third"),
                new Item("first"),
                new Item("second")
        );
        Collections.sort(items, new SortByNameItem().reversed());
        assertThat(items.get(0).toString(), is("third"));
    }
}
