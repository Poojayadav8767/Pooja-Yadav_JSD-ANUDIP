package com.ecobookingplatform.ebp.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecobookingplatform.ebp.entity.Payment;
import com.ecobookingplatform.ebp.repository.PaymentRepository;
import com.ecobookingplatform.ebp.service.PaymentService;

@Service
	public class PaymentServiceImpl implements PaymentService{
		
		@Autowired
		PaymentRepository pprepo;

		@Override
		public Payment addPayment(Payment payment) {
			return pprepo.save(payment);
		}

	}


