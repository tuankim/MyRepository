package com.tuannh.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

/**
 * DataTransfers generated by hbm2java
 */
@Table(value = "tuan_data_transfers")
public class DataTransfers implements java.io.Serializable {

	@PrimaryKey
	private Integer data_tranfer_id;
	private Acquisitions acquisitions;
	private Merchants merchants;
	private String dataTransferDate;
	private String merchantsFees;
	private String otherDetail;
	private Set<TransactionData> transactionData = new HashSet<TransactionData>(0);

	public DataTransfers() {
	}
	
	

	public DataTransfers(Integer dataTranferId) {
		super();
		this.data_tranfer_id = dataTranferId;
	}



	public DataTransfers(Acquisitions acquisitions, Merchants merchants, String dataTransferDate, String merchantsFees,
			String otherDetail) {
		this.acquisitions = acquisitions;
		this.merchants = merchants;
		this.dataTransferDate = dataTransferDate;
		this.merchantsFees = merchantsFees;
		this.otherDetail = otherDetail;
	}

	
	public Integer getDataTranferId() {
		return this.data_tranfer_id;
	}

	public void setDataTranferId(Integer dataTranferId) {
		this.data_tranfer_id = dataTranferId;
	}

	@Column(value = "Acquisition_ID")
	public Acquisitions getAcquisitions() {
		return this.acquisitions;
	}

	public void setAcquisitions(Acquisitions acquisitions) {
		this.acquisitions = acquisitions;
	}

	@Column(value = "Merchants_ID")
	public Merchants getMerchants() {
		return this.merchants;
	}

	public void setMerchants(Merchants merchants) {
		this.merchants = merchants;
	}

	@Column(value = "Data_Transfer_Date")
	public String getDataTransferDate() {
		return this.dataTransferDate;
	}

	public void setDataTransferDate(String dataTransferDate) {
		this.dataTransferDate = dataTransferDate;
	}

	@Column(value = "Merchants_Fees")
	public String getMerchantsFees() {
		return this.merchantsFees;
	}

	public void setMerchantsFees(String merchantsFees) {
		this.merchantsFees = merchantsFees;
	}

	@Column(value = "Other_Detail")
	public String getOtherDetail() {
		return this.otherDetail;
	}

	public void setOtherDetail(String otherDetail) {
		this.otherDetail = otherDetail;
	}
	
	public Set<TransactionData> getTransactionData() {
		return transactionData;
	}

	public void setTransactionData(Set<TransactionData> transactiomData) {
		this.transactionData = transactiomData;
	}

}
