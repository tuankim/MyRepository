package com.tuannh.model;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * TransactionData generated by hbm2java
 */

@Table(value = "tuan_transaction_data")
public class TransactionData implements java.io.Serializable {

	@PrimaryKey
	private UUID transaction_id;
	private UUID cardEnter;
	private UUID dataTransfer;
	private UUID reftransaction;
	private LocalDate transactionDate;
	private Integer transactionAmount;
	private String otherDetails;

	public TransactionData() {
	}

	// public TransactionData(CartCenters cardEnter, DataTransfers dataTransfer,
	// RefTransactionTypes transaction, String transactionDate, Integer
	// transactionAmount, String otherDetails) {
	// super();
	//
	// this.cardEnter = cardEnter;
	// this.dataTransfer = dataTransfer;
	// this.transaction = transaction;
	// this.transactionDate = transactionDate;
	// this.transactionAmount = transactionAmount;
	// this.otherDetails = otherDetails;
	// }
	
	public TransactionData(UUID transaction_Id, UUID cardEnter, UUID dataTransfer, UUID reftransaction,
			LocalDate transactionDate, Integer transactionAmount, String otherDetails) {
		super();
		this.transaction_id = transaction_Id;
		this.cardEnter = cardEnter;
		this.dataTransfer = dataTransfer;
		this.reftransaction = reftransaction;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
		this.otherDetails = otherDetails;
	}
	
	

	public UUID getTransactionId() {
		return this.transaction_id;
	}

	public void setTransactionId(UUID transactionId) {
		this.transaction_id = transactionId;
	}

	@Column(value = "Transaction_Date")
	public LocalDate getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
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
	public UUID getCardEnter() {
		return cardEnter;
	}

	public void setCardEnter(UUID cardEnter) {
		this.cardEnter = cardEnter;
	}

	@Column(value = "Data_Transfer_ID")
	public UUID getDataTransfer() {
		return dataTransfer;
	}

	public void setDataTransfer(UUID dataTransfer) {
		this.dataTransfer = dataTransfer;
	}

	@Column(value = "Transaction_Type_Code")
	public UUID getTransaction() {
		return reftransaction;
	}

	public void setTransaction(UUID reftransaction) {
		this.reftransaction = reftransaction;
	}

}
