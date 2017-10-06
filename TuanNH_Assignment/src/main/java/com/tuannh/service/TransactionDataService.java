package com.tuannh.service;

import java.util.List;
import java.util.UUID;

import com.tuannh.model.CartCenters;
import com.tuannh.model.Merchants;
import com.tuannh.model.TransactionData;

public interface TransactionDataService {
	
	List<TransactionData> findAll();
	
	void save(TransactionData transactionData);
	
	void ProcessAmountCardCenter(TransactionData transactionData);
	
	void ProcessAmountMerchants(TransactionData transactionData);
	
	CartCenters getcartCenter(UUID cardCenterID);
	
	Merchants getMerchants(UUID dataTransferID);
}
