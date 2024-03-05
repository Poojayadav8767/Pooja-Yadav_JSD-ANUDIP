package com.EcoOrder.Ecohub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.EcoOrder.Ecohub.entity.PaymentDetails;
import com.EcoOrder.Ecohub.service.PaymentDetailsService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class PaymentDetailsController {
	@Autowired
	PaymentDetailsService pps;
	
	@PostMapping("/savePayment")
	public ResponseEntity<PaymentDetails> saveBookings(@Valid @RequestBody PaymentDetails paymentDetails){
		return new ResponseEntity<PaymentDetails>(pps.addPayment(paymentDetails),HttpStatus.CREATED);
	}
}



