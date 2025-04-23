package com.vstech.service;

import java.util.List;

import com.vstech.Exception.RestaurantException;
import com.vstech.dto.RestaurantDto;
import com.vstech.model.Restaurant;
import com.vstech.model.User;
import com.vstech.request.CreateRestaurantRequest;

public interface RestaurantService {

	public Restaurant createRestaurant(CreateRestaurantRequest req,User user);

	public Restaurant updateRestaurant(Long restaurantId, CreateRestaurantRequest updatedRestaurant)
			throws RestaurantException;

	public void deleteRestaurant(Long restaurantId) throws RestaurantException;

	public List<Restaurant>getAllRestaurant();

	public List<Restaurant>searchRestaurant(String keyword);
	
	public Restaurant findRestaurantById(Long id) throws RestaurantException;

	public Restaurant getRestaurantsByUserId(Long userId) throws RestaurantException;
	
	public RestaurantDto addToFavorites(Long restaurantId,User user) throws RestaurantException;

	public Restaurant updateRestaurantStatus(Long id)throws RestaurantException;
}
