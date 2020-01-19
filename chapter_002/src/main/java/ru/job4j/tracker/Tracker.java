package ru.job4j.tracker;

import java.util.Random;
import java.util.Arrays;

public class Tracker {

    private final Item[] items = new Item[100];
    private int position = 0;

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public Item[] findAll() {
        Item[] allItem = new Item[this.position];
        int size = 0;
        for (int i = 0; i < this.position; i++) {
            Item item = this.items[i];
            if (item != null) {
                allItem[size++] = item;
            }
        }
        allItem = Arrays.copyOf(allItem, size);
        return allItem;
    }

    public Item[] findByName(String key) {
        Item[] itemByName = new Item[this.position];
        int size = 0;
        for (int i = 0; i < this.position; i++) {
            Item item = this.items[i];
            if (item.getName().equals(key)) {
                itemByName[size++] = item;
            }
        }
        itemByName = Arrays.copyOf(itemByName, size);
        return itemByName;
    }

    public Item findById(String id) {
        Item itemById = null;
        for (int i = 0; i < this.position; i++) {
            Item item = this.items[i];
            if (item.getId().equals(id)) {
                itemById = item;
            }
        }
        return itemById;
    }
}
