package com.djphy.showroom.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djphy.showroom.models.Sales;
import com.djphy.showroom.models.Vehicles;

public interface SalesRepository extends 
JpaRepository<Sales, Integer>{

	List<Sales> findByVehicles(Vehicles vehicles);
	
}
