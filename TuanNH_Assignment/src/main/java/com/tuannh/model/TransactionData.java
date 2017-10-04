package com.tuannh.model;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * TransactionData generated by hbm2java
 */
@Table(value = "tuan_transaction_data")
public class TransactionData implements java.io.Serializable {

	@PrimaryKey
	private Integer transaction_id;
	private Integer cardEnter;
	private Integer dataTransfer;
	private Integer transaction;
	private String transactionDate;
	private Integer transactionAmount;
	private String otherDetails;

	public TransactionData() {
	}

//	public TransactionData(CartCenters cardEnter, DataTransfers dataTransfer,
//			RefTransactionTypes transaction, String transactionDate, Integer transactionAmount, String otherDetails) {
//		super();
//		
//		this.cardEnter = cardEnter;
//		this.dataTransfer = dataTransfer;
//		this.transaction = transaction;
//		this.transactionDate = transactionDate;
//		this.transactionAmount = transactionAmount;
//		this.otherDetails = otherDetails;
//	}
	

	public TransactionData(Integer transaction_Id, Integer cardEnter, Integer dataTransfer,
			Integer transaction, String transactionDate, Integer transactionAmount, String otherDetails) {
		super();
		this.transaction_id = transaction_Id;
		this.cardEnter = cardEnter;
		this.dataTransfer = dataTransfer;
		this.transaction = transaction;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
		this.otherDetails = otherDetails;
	}

	public Integer getTransactionId() {
		return this.transaction_id;
	}

	public void setTransactionId(Integer transactionId) {
		this.transaction_id = transactionId;
	}

	@Column(value = "Transaction_Date")
	public String getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Column(value = "Transaction_Amount")
	public Integer getTransactionAmount() {
		return this.transactionAmount;
	}

	public void setTransactionAmount(Integer transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	@Column(value = "Other_Details")
	public String getOtherDetails() {
		return this.otherDetails;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	@Column(value = "Card_enter_ID")
	public Integer getCardEnter() {
		return cardEnter;
	}



	public void setCardEnter(Integer cardEnter) {
		this.cardEnter = cardEnter;
	}

	@Column(value = "Data_Transfer_ID")
	public Integer getDataTransfer() {
		return dataTransfer;
	}



	public void setDataTransfer(Integer dataTransfer) {
		this.dataTransfer = dataTransfer;
	}

	@Column(value = "Transaction_Type_Code")
	public Integer getTransaction() {
		return transaction;
	}



	public void setTransaction(Integer transaction) {
		this.transaction = transaction;
	}
	
	

}
