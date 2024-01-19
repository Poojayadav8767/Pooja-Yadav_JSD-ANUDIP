package com.ecobookingplatform.ebp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecobookingplatform.ebp.entity.Order;
import com.ecobookingplatform.ebp.repository.OrderRepository;
import com.ecobookingplatform.ebp.service.OrderService;

@Service
	public class OrderServiceImpl implements OrderService {

	    @Autowired
	    private OrderRepository orderRepository;

	    @Override
	    public Order createOrder(Order order) {
	        return orderRepository.save(order);
	    }

	    @Override
	    public List<Order> getAllOrders() {
	        return orderRepository.findAll();
	    }

	    @Override
	    public Order getOrderById(Long orderId) {
	        return orderRepository.findById(orderId).orElse(null);
	    }

	    @Override
	    public Order updateOrder(Integer orderId, Order updatedOrder) {
	        Order existingOrder = orderRepository.findById(orderId).orElse(null);

	        if (existingOrder != null) {
	            existingOrder.setProductName(updatedOrder.getProductName());
	            existingOrder.setQuantity(updatedOrder.getQuantity());
	            existingOrder.setTotalPrice(updatedOrder.getTotalPrice());

	            return orderRepository.save(existingOrder);
	        } else {
	            return null; // Order not found, handle accordingly (throw exception, return default, etc.)
	        }
	    }

	    @Override
	    public void deleteOrder(Long orderId) {
	        orderRepository.deleteById(orderId);
	    }
	}



