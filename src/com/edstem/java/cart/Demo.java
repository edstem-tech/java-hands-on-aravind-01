package com.edstem.java.cart;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ShoppingCartEntry soap = new ShoppingCartEntry(2, 34.5);
        ShoppingCartEntry detergent = new ShoppingCartEntry(1, 50);
        ShoppingCart myCart = new ShoppingCart(List.of(soap, detergent));
        ShoppingCartEntry flour = new ShoppingCartEntry(3, 23.6);
        myCart.addEntry(flour);
        System.out.println("Cart total : " + myCart.getTotalPrice());
        Order myOrder = new Order(myCart.getEntries(), 2.4);
        System.out.println("Order total : " + myOrder.getTotalPrice());

    }
}
