package com.tuannh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tuannh.model.Merchants;

public interface MerchantsRepository extends JpaRepository<Merchants, Integer>{
	@Query("update Merchants u set u.amount = ?1 where u.merchantId = ?2")
	void updateAmount(Integer Amount,Integer idMerchant);
}
