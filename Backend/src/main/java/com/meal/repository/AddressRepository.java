package com.meal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meal.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
