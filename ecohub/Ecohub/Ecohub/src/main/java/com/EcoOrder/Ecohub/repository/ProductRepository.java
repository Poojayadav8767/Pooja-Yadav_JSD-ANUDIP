package com.EcoOrder.Ecohub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EcoOrder.Ecohub.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}