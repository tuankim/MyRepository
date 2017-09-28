package com.tuannh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tuannh.model.TransactionData;

public interface TransactionDataRepository extends JpaRepository<TransactionData, Integer>{
	
}
