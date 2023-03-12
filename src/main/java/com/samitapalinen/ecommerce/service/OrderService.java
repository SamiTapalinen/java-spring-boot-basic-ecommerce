package com.samitapalinen.ecommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.samitapalinen.ecommerce.model.Order;
import com.samitapalinen.ecommerce.model.Quote;
import com.samitapalinen.ecommerce.model.User;

@Service
public class OrderService {
    private List<Order> orders = new ArrayList<>();

    public String addOrderFromQuote(Quote quote, User user) {
        try {
            Order order = new Order(user, quote.getProducts());
            orders.add(order);
        } catch (Exception e) {
            return e.getMessage();
        }
       return "Order added from quote";
    }

    public String addOrder(Order order)
    {
        try {
            orders.add(order);
        } catch (Exception e) {
            return e.getMessage();
        }
        return "Order added";
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Order getOrderById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public List<Order> getOrdersByUserId(int id) {
        List<Order> userOrders = new ArrayList<>();
        for (Order order : orders){
            if (order.getUser().getId() == id) {
                userOrders.add(order);
            }
        }
        return userOrders;
    }

    public String updateOrder(int id, Order updatedOrder)
    {
        int orderListSize = orders.size();
        for (int i = 0; i < orderListSize; i++) {
            if (orders.get(i).getId() == id) {
                updatedOrder.setId(id);
                orders.set(i, updatedOrder);
                return "Order updated";
            }
        }
        return "No order found";
    }

    public String deleteProduct(int id) {
        int orderListSize = orders.size();
        for (int i = 0; i < orderListSize; i++) {
            if (orders.get(i).getId() == id) {
                orders.remove(i);
                return "Order removed";
            }
        }
        return "No order found";
    }
}