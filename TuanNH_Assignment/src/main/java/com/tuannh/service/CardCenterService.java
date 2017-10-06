package com.tuannh.service;

import java.util.List;
import java.util.UUID;

import com.tuannh.model.CartCenters;

public interface CardCenterService {
	List<CartCenters> findAll();
	
	CartCenters save(CartCenters cardCenter);
	
	CartCenters findOne(UUID id);
	
	void deleteById(UUID id);
	
	void deleteAll();
}
