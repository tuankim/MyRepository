package com.tuannh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tuannh.model.CartCenters;
import com.tuannh.model.Merchants;
import com.tuannh.model.TransactionData;

public interface TransactionDataRepository extends JpaRepository<TransactionData, Integer>{
	@Query("select CartCenters from CartCenters,TransactionData where TransactionData.cardEnter=CartCenters.cardCenterId AND TransactionData.cardEnter.cardCenterId = ?1")
	CartCenters getcartCenter(Integer cardCenterID);
	
	@Query("select Merchants from Merchants,DataTransfers,TransactionData where Merchants.merchantId=DataTransfers.merchants.merchantId AND DataTransfers.dataTranferId=TransactionData.dataTransfer.dataTranferId AND TransactionData.dataTransfer.dataTranferId= ?1")
	Merchants getMerchants(Integer dataTransferID);
}
