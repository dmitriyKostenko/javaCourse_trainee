package ru.job4j.tracker;

import java.util.function.Consumer;

public class CreateAction implements UserAction {
    @Override
    public String name() {
        return "=== Create a new item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        output.accept("Add new item: " + item.getId() + " " + item.getName());
        return true;
    }
}
