
package com.tuannh.model;


import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Acquisitions generated by hbm2java
 */
@Entity
@Table(name = "tuan_acquisitions")
public class Acquisitions implements java.io.Serializable {

	private Integer acquisitionId;
	private Banks banks;
	private String acquisitionDate;
	private String otherDetails;
	private Set<DataTransfers> dataTransferses = new HashSet<DataTransfers>(0);

	public Acquisitions() {
	}

	public Acquisitions(Banks banks, String acquisitionDate, String otherDetails, Set<DataTransfers> dataTransferses) {
		this.banks = banks;
		this.acquisitionDate = acquisitionDate;
		this.otherDetails = otherDetails;
		this.dataTransferses = dataTransferses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Acquisition_ID", unique = true, nullable = false)
	public Integer getAcquisitionId() {
		return this.acquisitionId;
	}

	public void setAcquisitionId(Integer acquisitionId) {
		this.acquisitionId = acquisitionId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Bank_ID")
	public Banks getBanks() {
		return this.banks;
	}

	public void setBanks(Banks banks) {
		this.banks = banks;
	}

	@Column(name = "Acquisition_Date")
	public String getAcquisitionDate() {
		return this.acquisitionDate;
	}

	public void setAcquisitionDate(String acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	@Column(name = "Other_Details")
	public String getOtherDetails() {
		return this.otherDetails;
	}

	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "acquisitions")
	public Set<DataTransfers> getDataTransferses() {
		return this.dataTransferses;
	}

	public void setDataTransferses(Set<DataTransfers> dataTransferses) {
		this.dataTransferses = dataTransferses;
	}

}
