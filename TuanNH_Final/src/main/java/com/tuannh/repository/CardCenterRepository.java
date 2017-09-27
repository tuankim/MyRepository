package com.tuannh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tuannh.model.CartCenters;


public interface CardCenterRepository extends JpaRepository<CartCenters, Integer>{
	@Query("update CartCenters u set u.amount = ?1 where cardCenterId = ?2")
	void updateAmount(Integer Amount,Integer idCardCenters);
	
	
}
