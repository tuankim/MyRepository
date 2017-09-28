package com.tuannh.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tuannh.model.Merchants;
import com.tuannh.repository.CardCenterRepository;
import com.tuannh.repository.DataTransferRepository;

public class DataTransferServiceImpl implements DataTransferService{
	private DataTransferRepository dataTransferRepository;

	@Autowired
    public void setDataTransferRepository(DataTransferRepository dataTransferRepository) {
        this.dataTransferRepository = dataTransferRepository;
    }
	

}
