package ru.job4j.tracker;

import java.util.function.Consumer;

public class DeleteItemAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        String id = input.askStr("Select item's Id: ");
        if (tracker.delete(id)) {
            output.accept("Item with Id " + id + " was deleted.");
        } else {
            output.accept("Item with same Id was not found.");
        }
        return true;
    }
}
