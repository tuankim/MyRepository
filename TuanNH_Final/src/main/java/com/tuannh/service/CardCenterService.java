package com.tuannh.service;

import java.util.List;

import com.tuannh.model.CartCenters;

public interface CardCenterService {
	List<CartCenters> findAll();
	
	CartCenters save(CartCenters cardCenter);
	
	CartCenters findOne(Integer id);
	
	void deleteById(Integer id);
	
	void deleteAll();
}
