package com.tuannh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuannh.model.CartCenters;
import com.tuannh.repository.CardCenterRepository;

@Service
public class CardCenterServiceImpl implements CardCenterService{
	 	private CardCenterRepository cardCenterRepository;

		@Autowired
	    public void setCardCenterRepository(CardCenterRepository cardCenterRepository) {
	        this.cardCenterRepository = cardCenterRepository;
	    }
		
	    @Override
		public List<CartCenters> findAll() {
			// TODO Auto-generated method stub
			return cardCenterRepository.findAll();
		}
}
