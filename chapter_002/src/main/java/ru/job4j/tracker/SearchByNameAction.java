package ru.job4j.tracker;

import java.util.List;
import java.util.function.Consumer;

public class SearchByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Search item by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        String name = input.askStr("Select item's name: ");
        List<Item> items = tracker.findByName(name);
        output.accept("Search result: ");
        if (items.size() == 0) {
            output.accept("Items with same name was not found.");
        } else {
            for (Item item : items) {
                output.accept(item.getId() + " " + item.getName());
            }
        }
        return true;
    }
}
