package com.EcoOrder.Ecohub.service;

import com.EcoOrder.Ecohub.entity.PaymentDetails;

public interface PaymentDetailsService {
	// Register a new payment details in the database
    
    PaymentDetails addPayment(PaymentDetails paymentdetails);
    
    
}



