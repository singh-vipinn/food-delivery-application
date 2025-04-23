package com.vstech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vstech.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
