package com.tuannh.repository;

import java.util.UUID;

import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.tuannh.model.TransactionData;

public interface TransactionDataRepository extends CrudRepository<TransactionData, UUID>{
	@Query(value="SELECT * FROM tuan_transaction_data WHERE card_enter_id=?0 ALLOW FILTERING")
	Iterable<TransactionData> filterForCartCenter(UUID idCartCenter);
}
