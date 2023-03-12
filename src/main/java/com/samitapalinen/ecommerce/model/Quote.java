package com.samitapalinen.ecommerce.model;

import java.util.List;

public class Quote {
    private int id;

    private List<Product> products;

    private double totalPrice;

    private static int count = 0;

    public Quote() {
        this.id = count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
        double totalPrice = 0.0d;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        setTotalPrice(totalPrice);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
