package com.tuannh.repository;

import org.springframework.data.repository.CrudRepository;

import com.tuannh.model.DataTransfers;

public interface DataTransferRepository extends CrudRepository<DataTransfers, Integer>{
	
}
