package ru.job4j.tracker;

import java.util.function.Consumer;

public class ShowAllItemsAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        for (Item item : tracker.findAll()) {
            output.accept(item.getId() + " " + item.getName());
        }
        return true;
    }
}
