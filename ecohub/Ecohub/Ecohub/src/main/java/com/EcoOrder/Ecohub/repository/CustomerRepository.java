package com.EcoOrder.Ecohub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EcoOrder.Ecohub.entity.Customer;

//Repository to get predefined method of JpaRepository for Customer Entity
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
}


