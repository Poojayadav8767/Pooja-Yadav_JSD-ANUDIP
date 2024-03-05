package com.EcoOrder.Ecohub.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.EcoOrder.Ecohub.entity.PaymentDetails;
import com.EcoOrder.Ecohub.repository.PaymentDetailsRepository;
import com.EcoOrder.Ecohub.service.PaymentDetailsService;


@Service
public class PaymentDetailsServiceImpl implements PaymentDetailsService {
	@Autowired
    PaymentDetailsRepository paymentDetailsRepository;

	

	@Override
	public PaymentDetails addPayment(PaymentDetails paymentdetails) {
		// TODO Auto-generated method stub
		return paymentDetailsRepository.save(paymentdetails);
	}
	
}
	


