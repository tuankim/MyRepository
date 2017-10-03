package com.tuannh.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Banks generated by hbm2java
 */
@Entity
@Table(name = "tuan_banks")
public class Banks implements java.io.Serializable {

	private Integer bankId;
	private Addresses addresses;
	private String bankName;
	private String bankDetails;
	private Set<Acquisitions> acquisitionses = new HashSet<Acquisitions>(0);

	public Banks() {
	}

	public Banks(Addresses addresses, String bankName, String bankDetails, Set<Acquisitions> acquisitionses) {
		this.addresses = addresses;
		this.bankName = bankName;
		this.bankDetails = bankDetails;
		this.acquisitionses = acquisitionses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Bank_ID", unique = true, nullable = false)
	public Integer getBankId() {
		return this.bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Address_ID")
	public Addresses getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Addresses addresses) {
		this.addresses = addresses;
	}

	@Column(name = "Bank_Name")
	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	@Column(name = "Bank_Details")
	public String getBankDetails() {
		return this.bankDetails;
	}

	public void setBankDetails(String bankDetails) {
		this.bankDetails = bankDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "banks")
	public Set<Acquisitions> getAcquisitionses() {
		return this.acquisitionses;
	}

	public void setAcquisitionses(Set<Acquisitions> acquisitionses) {
		this.acquisitionses = acquisitionses;
	}

}
