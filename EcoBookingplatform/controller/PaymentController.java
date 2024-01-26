package com.ecobookingplatform.ebp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecobookingplatform.ebp.entity.Payment;
import com.ecobookingplatform.ebp.service.PaymentService;

import jakarta.validation.Valid;

@RestController
	public class PaymentController {
		
		@Autowired
		PaymentService pps;
		
		@PostMapping("/savePayment")
		public ResponseEntity<Payment> savePayment(@Valid @RequestBody Payment payment) {
		    return new ResponseEntity<>(pps.addPayment(payment), HttpStatus.CREATED);
		}
}



