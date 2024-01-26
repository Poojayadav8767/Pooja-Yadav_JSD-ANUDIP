package com.ecobookingplatform.ebp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecobookingplatform.ebp.entity.Order;
import com.ecobookingplatform.ebp.service.OrderService;

import jakarta.validation.Valid;

@RestController
	@RequestMapping("/api/orders")
	@Validated
	public class OrderController {

	    @Autowired
	    private OrderService orderService;

	    // Get all orders
	    @GetMapping
	    public ResponseEntity<List<Order>> getAllOrders() {
	        List<Order> orders = orderService.getAllOrder();
	        return new ResponseEntity<>(orders, HttpStatus.OK);
	    }

	    // Get order by ID
	    @GetMapping("/{orderId}")
	    public ResponseEntity<Order> getOrderById(@PathVariable Long orderId) {
	        Order order = orderService.getOrderById(orderId);
	        return new ResponseEntity<>(order, HttpStatus.OK);
	    }

	    // Create a new order
	    @PostMapping("/create")
	    public ResponseEntity<Order> createOrder(@Valid @RequestBody Order order) {
	        Order createdOrder = orderService.createOrder(order);
	        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
	    }

	    // Update order by ID
	    @PutMapping("/{orderId}")
	    public ResponseEntity<Order> updateOrder(@PathVariable Long orderId, @Valid @RequestBody Order updatedOrder) {
	        Order result = orderService.updateOrder(orderId, updatedOrder);
	        return new ResponseEntity<>(result, HttpStatus.OK);
	    }

	    // Delete order by ID
	    @DeleteMapping("/{orderId}")
	    public ResponseEntity<Void> deleteOrder(@PathVariable Long orderId) {
	        orderService.removeOrder(orderId);
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	    }
	}


