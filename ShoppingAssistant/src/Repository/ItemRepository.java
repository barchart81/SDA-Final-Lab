/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

/**
 *
 * @author fa22-bse-129
 */

import Domain.Item;
import java.util.ArrayList;
import java.util.List;

public class ItemRepository {
    private static List<Item> items = new ArrayList<>();

    static {
        items.add(new Item("1", "Laptop", 1200.0));
        items.add(new Item("2", "Smartphone", 800.0));
        items.add(new Item("3", "Headphones", 150.0));
    }

    public List<Item> getAllItems() {
        return items;
    }

    public Item getItemById(String id) {
        for (Item item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }
}

