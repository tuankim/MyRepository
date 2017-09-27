package com.tuannh.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tuannh.model.DataTransfers;
import com.tuannh.model.Merchants;

public interface DataTransferRepository extends JpaRepository<DataTransfers, Integer>{
	
}
