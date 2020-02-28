package ru.job4j.tracker;

import java.util.function.Consumer;

public class EditItemAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker, Consumer<String> output) {
        String id = input.askStr("Select item's Id: ");
        String name = input.askStr("Select item's new name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            output.accept("Item with Id " + item.getId() + " was edited. New name: " + item.getName());
        } else {
            output.accept("Item with same Id was not found.");
        }
        return true;
    }
}
