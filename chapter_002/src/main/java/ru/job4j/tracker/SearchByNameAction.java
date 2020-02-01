package ru.job4j.tracker;

public class SearchByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Search item by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Select item's name: ");
        Item[] items = tracker.findByName(name);
        System.out.println("Search result: ");
        if (items.length == 0) {
            System.out.println("Items with same name was not found.");
        } else {
            for (Item item : items) {
                System.out.println(item.getId() + " " + item.getName());
            }
        }
        return true;
    }
}
