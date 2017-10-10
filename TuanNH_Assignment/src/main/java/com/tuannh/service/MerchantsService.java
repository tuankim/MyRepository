package com.tuannh.service;

import java.util.List;
import java.util.UUID;

import com.tuannh.model.Merchants;

public interface MerchantsService {
	List<Merchants> findAll();

	Merchants save(Merchants merchants);

	Merchants findOne(UUID id);

	void deleteById(UUID id);

	void deleteAll();
}
