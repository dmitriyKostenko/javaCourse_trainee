package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Arrays;

public class Tracker {

    private final List<Item> items = new ArrayList<>();

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    private int indexOf(String id) {
        int rsl = -1;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                rsl = items.indexOf(item);
                break;
            }
        }
        return rsl;
    }

    public Item add(Item item) {
        item.setId(this.generateId());
        items.add(item);
        return item;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> itemByName = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                itemByName.add(item);
            }
        }
        return itemByName;
    }

    public Item findById(String id) {
        if (indexOf(id) != -1) {
            return items.get(this.indexOf(id));
        }
        return null;
    }

    public boolean replace(String id, Item item) {
        boolean exist = false;
        int index = this.indexOf(id);
        if (index != -1) {
            item.setId(items.get(index).getId());
            items.set(index, item);
            exist = true;
        }
        return exist;
    }

    public boolean delete(String id) {
        boolean exist = false;
        int index = this.indexOf(id);
        if (index != -1) {
            items.remove(index);
            exist = true;
        }
        return exist;
    }
}