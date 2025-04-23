package com.vstech.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vstech.model.Cart;

public interface CartRepository extends JpaRepository<Cart, Long> {

	 Optional<Cart> findByCustomer_Id(Long userId);
}
