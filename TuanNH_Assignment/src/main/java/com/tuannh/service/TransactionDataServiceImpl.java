package com.tuannh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuannh.model.CartCenters;
import com.tuannh.model.DataTransfers;
import com.tuannh.model.Merchants;
import com.tuannh.model.TransactionData;
import com.tuannh.repository.CardCenterRepository;
import com.tuannh.repository.DataTransferRepository;
import com.tuannh.repository.MerchantsRepository;
import com.tuannh.repository.TransactionDataRepository;

@Service
public class TransactionDataServiceImpl implements TransactionDataService{
	
	private CardCenterRepository cardCenterRepository;
	private TransactionDataRepository transactionDataRepository;
	private MerchantsRepository merchantRepository;
	private DataTransferRepository dataTransferRepository;

	@Autowired
	public void setTransactionDataRepository(TransactionDataRepository transactionDataRepository) {
		this.transactionDataRepository = transactionDataRepository;
	}
	
	@Autowired
	public void setCardCenterRepository(CardCenterRepository cardCenterRepository) {
		this.cardCenterRepository = cardCenterRepository;
	}
	
	@Autowired
	public void setMerchantRepository(MerchantsRepository merchantRepository) {
		this.merchantRepository = merchantRepository;
	}
	
	@Autowired
	public void setDataTransferRepository(DataTransferRepository dataTransferRepository) {
		this.dataTransferRepository = dataTransferRepository;
	}

	@Override
	public List<TransactionData> findAll() {
		// TODO Auto-generated method stub
		return (List<TransactionData>) transactionDataRepository.findAll();
	}
	
	@Override
	public void ProcessAmountCardCenter(TransactionData transactionData) {
		CartCenters cardCenter=getcartCenter(transactionData.getCardEnter());
		cardCenter.setAmount(cardCenter.getAmount()-transactionData.getTransactionAmount());
		cardCenterRepository.save(cardCenter);
		
	}
	
	

	@Override
	public void ProcessAmountMerchants(TransactionData transactionData) {
		Merchants merchant=getMerchants(transactionData.getDataTransfer());
		merchant.setAmount(merchant.getAmount()+transactionData.getTransactionAmount());
		merchantRepository.save(merchant);
	}

	@Override
	public void save(TransactionData transactionData) {
		// TODO Auto-generated method stub
		transactionDataRepository.save(transactionData);
	}

	@Override
	public CartCenters getcartCenter(Integer cardCenterID) {
		// TODO Auto-generated method stub
		System.out.println(cardCenterRepository.findOne(cardCenterID).toString());
		return cardCenterRepository.findOne(cardCenterID);
	}

	@Override
	public Merchants getMerchants(Integer dataTransferID) {
		// TODO Auto-generated method stub
		DataTransfers data=dataTransferRepository.findOne(dataTransferID);
		
		return merchantRepository.findOne(data.getMerchants().getMerchantId());
	}
	
	
}
