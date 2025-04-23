package com.vstech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vstech.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
