package com.samitapalinen.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samitapalinen.ecommerce.model.Order;
import com.samitapalinen.ecommerce.model.Quote;
import com.samitapalinen.ecommerce.service.OrderService;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("orders")
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    @GetMapping("orders/{id}")
    public Quote getOrderById(@PathVariable int id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("order")
    public String addOrder(@RequestBody Order order) {
        return orderService.addOrder(order);
    }

    @PutMapping("order/{id}")
    public String updateOrder(@PathVariable int id, @RequestBody Order order) {
        return orderService.updateOrder(id, order);
    }
}
