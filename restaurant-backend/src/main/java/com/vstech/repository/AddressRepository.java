package com.vstech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vstech.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
