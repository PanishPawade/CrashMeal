package com.noqcart.crashmeal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BANKDETAIL")
public class BankDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long bankDetailId;
	private String bankName;
	private String transitNumber;
	private String InstitutionNumber;
	
	public Long getBankDetailId() {
		return bankDetailId;
	}
	public void setBankDetailId(Long bankDetailId) {
		this.bankDetailId = bankDetailId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public String getInstitutionNumber() {
		return InstitutionNumber;
	}
	public void setInstitutionNumber(String institutionNumber) {
		InstitutionNumber = institutionNumber;
	}
	public String getTransitNumber() {
		return transitNumber;
	}
	public void setTransitNumber(String transitNumber) {
		this.transitNumber = transitNumber;
	}
	
}
