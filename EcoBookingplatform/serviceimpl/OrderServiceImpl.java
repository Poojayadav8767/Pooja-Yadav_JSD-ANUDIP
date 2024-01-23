package com.ecobookingplatform.ebp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecobookingplatform.ebp.entity.Order;
import com.ecobookingplatform.ebp.exception.OrderIdNotFoundException;
import com.ecobookingplatform.ebp.repository.OrderRepository;
import com.ecobookingplatform.ebp.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {


	@Autowired
	OrderRepository orderRepository;

	@Override
	public Order displayOrderById(int OrderId)
	{
		return orderRepository.findById(OrderId).orElseThrow(() -> new OrderIdNotFoundException("Order does not exist."));
	}

	@Override
	public Order createOrder(Order newOrder) {
		return orderRepository.save(newOrder);
	}

	@Override
	public List<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrderById(Long orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order updateOrder(Long orderId, Order updatedOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOrder(Long orderId) {
		// TODO Auto-generated method stub
		
	}
}