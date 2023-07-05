package com.company;

import java.util.ArrayList;

public class Groceries {
    private final ArrayList<String> groceries = new ArrayList<>();

    public ArrayList<String> getGroceries() {
        return groceries;
    }

    public void addItem(String item) {
        groceries.add(item);
    }

    public int modifyItem(String oldItem, String newItem) {
        String hasOldItem = findItem(oldItem);
        if(hasOldItem != null) {
            int oldItemIndex = groceries.indexOf(oldItem);
            groceries.set(oldItemIndex, newItem);
            return 1;
        } else {
            return 0;
        }
    }

    public int removeItem(String name) {
        if(groceries.contains(name)) {
            groceries.remove(name);
            return 1;
        }
        return 0;
    }

    public String findItem(String name) {
        if(groceries.contains(name)) {
            return name;
        }
        return null;
    }

}