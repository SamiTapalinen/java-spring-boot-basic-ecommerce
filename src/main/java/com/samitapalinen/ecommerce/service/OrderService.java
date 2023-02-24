package com.samitapalinen.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import com.samitapalinen.ecommerce.model.Order;
import com.samitapalinen.ecommerce.model.User;

public class OrderService {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<Order> getOrdersByUser(User user) {
        List<Order> userOrders = new ArrayList<>();

        for(Order order : orders){
            if (order.getUser().equals(user) ) {
                userOrders.add(order);
            }
        }

        return userOrders;
    }
}