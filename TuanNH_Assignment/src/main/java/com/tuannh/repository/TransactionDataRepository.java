package com.tuannh.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.tuannh.model.TransactionData;

public interface TransactionDataRepository extends CrudRepository<TransactionData, UUID>{
	
}
