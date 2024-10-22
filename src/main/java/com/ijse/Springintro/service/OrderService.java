package com.ijse.Springintro.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ijse.Springintro.entity.Order;

@Service
public interface OrderService {
    List<Order>getAllOrders();
    Order createOrder(Order order);
}
