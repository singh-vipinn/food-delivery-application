package com.vstech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vstech.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
