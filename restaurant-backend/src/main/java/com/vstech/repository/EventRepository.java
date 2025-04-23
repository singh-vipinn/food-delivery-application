package com.vstech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vstech.model.Events;

public interface EventRepository extends JpaRepository<Events, Long>{

	public List<Events> findEventsByRestaurantId(Long id);
}
