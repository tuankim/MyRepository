package com.tuannh.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * TransactionData generated by hbm2java
 */
@Entity
@Table(name = "tuan_transaction_data")
public class TransactionData implements java.io.Serializable {

	private Integer transactionId;
	private CartCenters cardEnter;
	private DataTransfers dataTransfer;
	private RefTransactionTypes transaction;
	private String transactionDate;
	private Integer transactionAmount;
	private String otherDetails;

	public TransactionData() {
	}

	public TransactionData(CartCenters cardEnter, DataTransfers dataTransfer,
			RefTransactionTypes transaction, String transactionDate, Integer transactionAmount, String otherDetails) {
		super();
		
		this.cardEnter = cardEnter;
		this.dataTransfer = dataTransfer;
		this.transaction = transaction;
		this.transactionDate = transactionDate;
		this.transactionAmount = transactionAmount;
		this.otherDetails = otherDetails;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Transaction_ID", unique = true, nullable = false)
	public Integer getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}

	@Column(name = "Transaction_Date")
	public String getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	@Column(name = "Transaction_Amount")
	public Integer getTransactionAmount() {
		return this.transactionAmount;
	}

	public void setTransactionAmount(Integer transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	@Column(name = "Other_Details")
	public String getOtherDetails() {
		return this.otherDetails;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Card_enter_ID")
	public CartCenters getCardEnter() {
		return cardEnter;
	}



	public void setCardEnter(CartCenters cardEnter) {
		this.cardEnter = cardEnter;
	}

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Data_Transfer_ID")
	public DataTransfers getDataTransfer() {
		return dataTransfer;
	}



	public void setDataTransfer(DataTransfers dataTransfer) {
		this.dataTransfer = dataTransfer;
	}

	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Transaction_Type_Code")
	public RefTransactionTypes getTransaction() {
		return transaction;
	}



	public void setTransaction(RefTransactionTypes transaction) {
		this.transaction = transaction;
	}
	
	

}
