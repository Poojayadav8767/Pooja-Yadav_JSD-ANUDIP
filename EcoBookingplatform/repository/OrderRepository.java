package com.ecobookingplatform.ebp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.criteria.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

	void deleteById(Long orderId);

    // You can add custom query methods here if needed
    // For example, find orders by type
    // List<Order> findByType(String type);

}


