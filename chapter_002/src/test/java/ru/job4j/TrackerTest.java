package ru.job4j;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenFindAllItemThenGetAllItem() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item third = new Item("test3");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        Item[] expect = {first, second, third};
        assertThat(tracker.findAll(), is(expect));
    }

    @Test
    public void whenFindByNameThenGetItemWithSameName() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item third = new Item("test3");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        Item[] result = tracker.findByName("test2");
        Item[] expect = {second};
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindByNameThenGetItemsWithSameName() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item third = new Item("test2");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        Item[] result = tracker.findByName("test2");
        Item[] expect = {second, third};
        assertThat(result, is(expect));
    }

    @Test
    public void whenFindByIdThenGetItemWithSameId() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1");
        Item second = new Item("test2");
        Item third = new Item("test2");
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        Item result = tracker.findById(second.getId());
        assertThat(result.getName(), is(second.getName()));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
}
