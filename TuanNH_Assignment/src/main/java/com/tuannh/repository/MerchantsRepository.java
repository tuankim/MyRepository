package com.tuannh.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.tuannh.model.Merchants;

public interface MerchantsRepository extends CrudRepository<Merchants, UUID>{

}
