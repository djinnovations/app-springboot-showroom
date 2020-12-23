package com.djphy.showroom.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djphy.showroom.models.Vehicles;

public interface VehicleRepository extends 
JpaRepository<Vehicles, Integer>{

	
}
