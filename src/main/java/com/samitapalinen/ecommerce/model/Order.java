package com.samitapalinen.ecommerce.model;

import java.util.List;
import java.util.ArrayList;

/**
 * Order is basically just a copy of a quote and in this case, with some extra information,
 * hence the order is a child of a quote.
 */
public class Order extends Quote {
    private int id;

    private User user;

    private static int count = 0;

    public Order()
    {
        this(null, new ArrayList<>());
    }

    public Order(User user, List<Product> products) {
        this.id = count++;
        this.user = user;
        this.setProducts(products);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
