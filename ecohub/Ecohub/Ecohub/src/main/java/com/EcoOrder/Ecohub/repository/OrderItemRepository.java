package com.EcoOrder.Ecohub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EcoOrder.Ecohub.entity.OrderItem;

	public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{
		

}
