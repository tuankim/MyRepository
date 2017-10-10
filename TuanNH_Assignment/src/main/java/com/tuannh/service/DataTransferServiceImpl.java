package com.tuannh.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuannh.model.CartCenters;
import com.tuannh.model.DataTransfers;
import com.tuannh.repository.CardCenterRepository;
import com.tuannh.repository.DataTransferRepository;

@Service
public class DataTransferServiceImpl implements DataTransferService{
	private DataTransferRepository dataTransferRepository;

	@Autowired
    public void setDataTransferRepository(DataTransferRepository dataTransferRepository) {
        this.dataTransferRepository = dataTransferRepository;
    }
	
	
    @Override
	public List<DataTransfers> findAll() {
		// TODO Auto-generated method stub
		return (List<DataTransfers>) dataTransferRepository.findAll();
	}

	@Override
	public DataTransfers save(DataTransfers dataTransfers) {
		// TODO Auto-generated method stub
	
		return dataTransferRepository.save(dataTransfers);
	}

	@Override
	public DataTransfers findOne(UUID id) {
		// TODO Auto-generated method stub
		return dataTransferRepository.findOne(id);
	}

	@Override
	public void deleteById(UUID id) {
		// TODO Auto-generated method stub
		dataTransferRepository.delete(id);;
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		dataTransferRepository.deleteAll();
	}
	
}
