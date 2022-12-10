package com.edstem.java.cart;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShoppingCart {
    private final List<ShoppingCartEntry> entries = new ArrayList<>();

    public ShoppingCart(List<ShoppingCartEntry> initialEntries) {
        if(Objects.nonNull(initialEntries)) {
            this.entries.addAll(List.copyOf(initialEntries));
        }
    }

    public void addEntry(ShoppingCartEntry entry) {
        this.entries.add(entry);
    }

    public void deleteEntry(ShoppingCartEntry entry) {
        this.entries.remove(entry);
    }

    public List<ShoppingCartEntry> getEntries() {
        return entries;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (ShoppingCartEntry shoppingCartEntry : entries) {
            totalPrice += (shoppingCartEntry.getPrice() * shoppingCartEntry.getQuantity());
        }
        return totalPrice;
    }

}
