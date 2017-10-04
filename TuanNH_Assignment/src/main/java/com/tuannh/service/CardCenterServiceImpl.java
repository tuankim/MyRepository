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
			return (List<CartCenters>) cardCenterRepository.findAll();
		}

		@Override
		public CartCenters save(CartCenters cardCenter) {
			// TODO Auto-generated method stub
			return cardCenterRepository.save(cardCenter);
		}

		@Override
		public CartCenters findOne(Integer id) {
			// TODO Auto-generated method stub
			return cardCenterRepository.findOne(id);
		}

		@Override
		public void deleteById(Integer id) {
			// TODO Auto-generated method stub
			cardCenterRepository.delete(id);;
			
		}

		@Override
		public void deleteAll() {
			// TODO Auto-generated method stub
			cardCenterRepository.deleteAll();
		}
		
		
	    
}
