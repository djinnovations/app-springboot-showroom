package com.djphy.showroom.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djphy.showroom.models.Customers;

public interface CustomersRepository extends 
JpaRepository<Customers, Integer>{

	
}
