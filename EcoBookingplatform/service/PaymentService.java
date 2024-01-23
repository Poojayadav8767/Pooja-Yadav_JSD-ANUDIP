package com.ecobookingplatform.ebp.service;

import com.ecobookingplatform.ebp.entity.Payment;

import jakarta.validation.Valid;

public interface PaymentService {
		
		Payment addPayment(@Valid Payment payment);
	}



