package com.tuannh.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

public class TransactionDataInfo implements Serializable{
	private String cardEnter;
	private String dataTransfer;
	private String reftransaction;
	private Integer transactionAmount;
	private String otherDetails;
	
	public TransactionDataInfo(String cardEnter, String dataTransfer, String reftransaction, Integer transactionAmount,
			String otherDetails) {
		super();
		this.cardEnter = cardEnter;
		this.dataTransfer = dataTransfer;
		this.reftransaction = reftransaction;
		this.transactionAmount = transactionAmount;
		this.otherDetails = otherDetails;
	}

	public String getCardEnter() {
		return cardEnter;
	}

	public void setCardEnter(String cardEnter) {
		this.cardEnter = cardEnter;
	}

	public String getDataTransfer() {
		return dataTransfer;
	}

	public void setDataTransfer(String dataTransfer) {
		this.dataTransfer = dataTransfer;
	}

	public String getReftransaction() {
		return reftransaction;
	}

	public void setReftransaction(String reftransaction) {
		this.reftransaction = reftransaction;
	}

	public Integer getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Integer transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getOtherDetails() {
		return otherDetails;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}
	
	
}
