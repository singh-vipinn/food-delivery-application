package com.vstech.service;

import java.util.List;

import com.vstech.model.Notification;
import com.vstech.model.Order;
import com.vstech.model.Restaurant;
import com.vstech.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
