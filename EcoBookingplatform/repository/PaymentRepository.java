package com.ecobookingplatform.ebp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecobookingplatform.ebp.entity.Payment;

public interface PaymentRepository  extends JpaRepository<Payment, Integer>{
		
	}



