package com.noqcart.crashmeal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PARTNER")
public class Partner {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PARTNER_ID")
	private Long partnerId;
	private String partnerName;
	
	@OneToMany
	@JoinTable(name="PARTNER_OUTLETS", joinColumns=@JoinColumn(name="PARTNER_ID"),
		inverseJoinColumns=@JoinColumn(name="OUTLET_ID")
			)
	private List<Outlet> outlets = new ArrayList<Outlet>(); 
	
	public Long getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public List<Outlet> getOutlets() {
		return outlets;
	}
	public void setOutlets(List<Outlet> outlets) {
		this.outlets = outlets;
	}
	
	
	/*private String partnerAddr;
	private Long parentPartnerId;
	private String cusineId;
	private boolean isPureVeg;
	private String password;
	private String emailId;
	private Long partnerTypeId;*/
	
	
}
