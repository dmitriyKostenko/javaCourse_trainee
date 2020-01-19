package ru.job4j.tracker;

import java.util.Random;
import java.util.Arrays;

public class Tracker {

    private final Item[] items = new Item[100];
    private int position = 0;

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
        return item;
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
        if (indexOf(id) != -1) {
            return items[indexOf(id)];
        }
        return null;
    }

    public void replace(String id, Item item) {
        int index = indexOf(id);
        item.setId(this.items[index].getId());
        this.items[index] = item;
    }

    public void delete(String id) {
        int startPos = indexOf(id) + 1;
        int distPos = indexOf(id);
        int size = position - indexOf(id);
        System.arraycopy(items, startPos, items, distPos, size);
        items[position] = null;
        position--;
    }
}