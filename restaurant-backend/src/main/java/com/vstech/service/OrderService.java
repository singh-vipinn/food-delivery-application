package com.vstech.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.vstech.Exception.CartException;
import com.vstech.Exception.OrderException;
import com.vstech.Exception.RestaurantException;
import com.vstech.Exception.UserException;
import com.vstech.model.Order;
import com.vstech.model.PaymentResponse;
import com.vstech.model.User;
import com.vstech.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
