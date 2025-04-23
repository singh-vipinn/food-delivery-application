package com.vstech.service;

import com.stripe.exception.StripeException;
import com.vstech.model.Order;
import com.vstech.model.PaymentResponse;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
