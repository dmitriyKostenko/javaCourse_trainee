package ru.job4j.tracker;

public class EditItemAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Select item's Id: ");
        String name = input.askStr("Select item's new name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item with Id " + item.getId() + " was edited. New name: " + item.getName());
        } else {
            System.out.println("Item with same Id was not found.");
        }
        return true;
    }
}
