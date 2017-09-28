package com.tuannh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tuannh.model.Merchants;

public interface MerchantsRepository extends JpaRepository<Merchants, Integer>{

}
