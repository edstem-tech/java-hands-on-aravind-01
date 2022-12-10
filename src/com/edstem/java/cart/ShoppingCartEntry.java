package com.edstem.java.cart;

public class ShoppingCartEntry {
    private final int quantity;
    private final double price;

    public ShoppingCartEntry(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
