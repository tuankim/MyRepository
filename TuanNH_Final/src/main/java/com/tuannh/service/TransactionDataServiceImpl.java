package com.tuannh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuannh.model.CartCenters;
import com.tuannh.model.Merchants;
import com.tuannh.model.TransactionData;
import com.tuannh.repository.CardCenterRepository;
import com.tuannh.repository.MerchantsRepository;
import com.tuannh.repository.TransactionDataRepository;

@Service
public class TransactionDataServiceImpl implements TransactionDataService{
	
	private CardCenterRepository cardCenterRepository;
	private TransactionDataRepository transactionDataRepository;
	private MerchantsRepository merchantRepository;

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

	@Override
	public List<TransactionData> findAll() {
		// TODO Auto-generated method stub
		return transactionDataRepository.findAll();
	}
	
	@Override
	public void ProcessAmountCardCenter(TransactionData transactionData) {
		CartCenters cardCenter=getcartCenter(transactionData.getCardEnter().getCardCenterId());
		cardCenter.setAmount(cardCenter.getAmount()-transactionData.getTransactionAmount());
		cardCenterRepository.updateAmount(cardCenter.getAmount(),cardCenter.getCardCenterId());
		
	}
	
	

	@Override
	public void ProcessAmountMerchants(TransactionData transactionData) {
		Merchants merchant=getMerchants(transactionData.getDataTransfer().getDataTranferId());
		merchant.setAmount(merchant.getAmount()+transactionData.getTransactionAmount());
		merchantRepository.updateAmount(merchant.getAmount(), merchant.getMerchantId());
	}

	@Override
	public void save(TransactionData transactionData) {
		// TODO Auto-generated method stub
		transactionDataRepository.save(transactionData);
	}

	@Override
	public CartCenters getcartCenter(Integer cardCenterID) {
		// TODO Auto-generated method stub
		return transactionDataRepository.getcartCenter(cardCenterID);
	}

	@Override
	public Merchants getMerchants(Integer dataTransferID) {
		// TODO Auto-generated method stub
		return transactionDataRepository.getMerchants(dataTransferID);
	}
	
	
}
