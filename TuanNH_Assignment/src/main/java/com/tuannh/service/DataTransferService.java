package com.tuannh.service;

import java.util.List;
import java.util.UUID;

import com.tuannh.model.CartCenters;
import com.tuannh.model.DataTransfers;
import com.tuannh.model.Merchants;

public interface DataTransferService {
	List<DataTransfers> findAll();

	DataTransfers save(DataTransfers dataTransfers);

	DataTransfers findOne(UUID id);

	void deleteById(UUID id);

	void deleteAll();
}
