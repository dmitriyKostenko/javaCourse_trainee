package ru.job4j.tracker;

public class SearchByIdAction implements UserAction {
    @Override
    public String name() {
        return "=== Search item by Id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Select item's Id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Search result: " + item.getId() + " " + item.getName());
        } else {
            System.out.println("Item with same Id was not found.");
        }
        return true;
    }
}
