package com.samitapalinen.ecommerce.model;

/**
 * Order is basically just a copy of a quote and in this case, with some extra information,
 * hence the order is a child of a quote.
 */
public class Order extends Quote {
    private User user;

    private int uid;

    private static int count = 0;

    public Order() {
        this.uid = count++;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getUid() {
        return uid;
    }
}
