package com.tuannh.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.tuannh.model.CartCenters;


public interface CardCenterRepository extends CrudRepository<CartCenters, UUID>{
	
	
	
}
