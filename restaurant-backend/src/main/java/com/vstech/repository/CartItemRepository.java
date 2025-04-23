package com.vstech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vstech.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
