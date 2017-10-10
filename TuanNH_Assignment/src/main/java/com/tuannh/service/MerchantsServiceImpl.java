package com.tuannh.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuannh.model.CartCenters;
import com.tuannh.model.Merchants;
import com.tuannh.repository.MerchantsRepository;

@Service
public class MerchantsServiceImpl implements MerchantsService{
	
	private MerchantsRepository merchantsRepository;

	@Autowired
    public void setCardCenterRepository(MerchantsRepository merchantsRepository) {
        this.merchantsRepository= merchantsRepository;
    }
	
    @Override
	public List<Merchants> findAll() {
		// TODO Auto-generated method stub
		return (List<Merchants>) merchantsRepository.findAll();
	}

	@Override
	public Merchants save(Merchants cardCenter) {
		// TODO Auto-generated method stub
	
		return merchantsRepository.save(cardCenter);
	}

	@Override
	public Merchants findOne(UUID id) {
		// TODO Auto-generated method stub
		return merchantsRepository.findOne(id);
	}

	@Override
	public void deleteById(UUID id) {
		// TODO Auto-generated method stub
		merchantsRepository.delete(id);;
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		merchantsRepository.deleteAll();
	}
}
