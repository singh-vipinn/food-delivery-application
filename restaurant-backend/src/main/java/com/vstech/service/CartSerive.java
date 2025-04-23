package com.vstech.service;

import com.vstech.Exception.CartException;
import com.vstech.Exception.CartItemException;
import com.vstech.Exception.FoodException;
import com.vstech.Exception.UserException;
import com.vstech.model.Cart;
import com.vstech.model.CartItem;
import com.vstech.model.Food;
import com.vstech.model.User;
import com.vstech.request.AddCartItemRequest;
import com.vstech.request.UpdateCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
