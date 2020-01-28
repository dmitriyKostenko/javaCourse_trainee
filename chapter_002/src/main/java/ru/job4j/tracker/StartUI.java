package ru.job4j.tracker;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                System.out.println("=== Create a new item ===");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Add new item: " + item.getId() + " " + item.getName());
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                for (Item item : tracker.findAll()) {
                    System.out.println(item.getId() + " " + item.getName());
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                String id = input.askStr("Select item's Id: ");
                String name = input.askStr("Select item's new name: ");
                Item item = new Item(name);
                tracker.replace(id, item);
                System.out.println("Item with Id " + item.getId() + " was edited. New name: " + item.getName());
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                String id = input.askStr("Select item's Id: ");
                tracker.delete(id);
                System.out.println("Item with Id " + id + " was deleted.");
            } else if (select == 4) {
                System.out.println("=== Search item by Id ===");
                String id = input.askStr("Select item's Id: ");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Search result: " + item.getId() + " " + item.getName());
                } else {
                    System.out.println("Item with same Id was not found.");
                }
            } else if (select == 5) {
                System.out.println("=== Search item by name ===");
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
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}