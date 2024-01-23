package com.ecobookingplatform.ebp.service;

import java.util.List;

import com.ecobookingplatform.ebp.entity.Order;



public interface OrderService {

    // Create a new order in the database
    Order createOrder(Order order);

    // Retrieve all orders from the database
    List<Order> getAllOrders();

    // Retrieve an order by its ID from the database
    Order getOrderById(Long orderId);

    // Update an existing order by its ID in the database
    Order updateOrder(Long orderId, Order updatedOrder);

    // Delete an order by its ID from the database
    void deleteOrder(Long orderId);

	Order displayOrderById(int OrderId);
}
