package com.edstem.java.cart;

import java.util.ArrayList;
import java.util.List;

public class Order extends ShoppingCart {
    private final double tax;

    public Order(List<ShoppingCartEntry> entries, double tax) {
        super(entries);
        this.tax = tax;
    }

    @Override
    public double getTotalPrice() {
        return tax * super.getTotalPrice();
    }
}
