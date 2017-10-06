package com.tuannh.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.tuannh.model.DataTransfers;

public interface DataTransferRepository extends CrudRepository<DataTransfers, UUID>{
	
}
