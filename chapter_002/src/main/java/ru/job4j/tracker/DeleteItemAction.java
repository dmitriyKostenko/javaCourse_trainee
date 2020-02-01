package ru.job4j.tracker;

public class DeleteItemAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Select item's Id: ");
        if (tracker.delete(id)) {
            System.out.println("Item with Id " + id + " was deleted.");
        } else {
            System.out.println("Item with same Id was not found.");
        }
        return true;
    }
}
