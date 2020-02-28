package ru.job4j.tracker;

import java.util.function.Consumer;

public class SearchByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Search item by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        String id = input.askStr("Select item's Id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            output.accept("Search result: " + item.getId() + " " + item.getName());
        } else {
            output.accept("Item with same Id was not found.");
        }
        return true;
    }
}
