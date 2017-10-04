package com.tuannh.repository;

import org.springframework.data.repository.CrudRepository;

import com.tuannh.model.TransactionData;

public interface TransactionDataRepository extends CrudRepository<TransactionData, Integer>{
	
}
