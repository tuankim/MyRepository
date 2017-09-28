package com.tuannh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tuannh.model.CartCenters;


public interface CardCenterRepository extends JpaRepository<CartCenters, Integer>{
	
	
	
}
