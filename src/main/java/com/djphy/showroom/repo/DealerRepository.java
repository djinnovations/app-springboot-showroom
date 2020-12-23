package com.djphy.showroom.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.djphy.showroom.models.Dealers;

public interface DealerRepository extends 
JpaRepository<Dealers, Integer>{

	
}
