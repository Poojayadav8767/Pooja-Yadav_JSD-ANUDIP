package com.ecobookingplatform.ebp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecobookingplatform.ebp.entity.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{
		
	}



