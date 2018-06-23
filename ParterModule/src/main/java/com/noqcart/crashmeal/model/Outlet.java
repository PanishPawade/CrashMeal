package com.noqcart.crashmeal.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="OUTLET")
public class Outlet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long outletId;
	private String email;
	private String phoneNumber;
	private String fax;
	private String address;
	private String country;
	private String city;
	private String postalCode;
	private String licenseNumber;
	private String webSiteLink;
	private String partnerType;
	private String partnerService;
	private String cusineType;
	private String partnerLogo;
	
	@OneToOne
	private Availability availability;
	
	private String contactPersonName;
	private String contactPersonEmail;
	private String contactPersonPhone;
	private String partnerPaymentType;
	
	@OneToOne
	private BankDetail bankDetail;
	
	//@ManyToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="partnerId")
	//private Partner partner;
	
	public Long getOutletId() {
		return outletId;
	}
	public void setOutletId(Long outletId) {
		this.outletId = outletId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getWebSiteLink() {
		return webSiteLink;
	}
	public void setWebSiteLink(String webSiteLink) {
		this.webSiteLink = webSiteLink;
	}
	public String getPartnerType() {
		return partnerType;
	}
	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}
	public String getPartnerService() {
		return partnerService;
	}
	public void setPartnerService(String partnerService) {
		this.partnerService = partnerService;
	}
	public String getCusineType() {
		return cusineType;
	}
	public void setCusineType(String cusineType) {
		this.cusineType = cusineType;
	}
	public String getPartnerLogo() {
		return partnerLogo;
	}
	public void setPartnerLogo(String partnerLogo) {
		this.partnerLogo = partnerLogo;
	}
	public Availability getAvailability() {
		return availability;
	}
	public void setAvailability(Availability availability) {
		this.availability = availability;
	}
	public String getContactPersonName() {
		return contactPersonName;
	}
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}
	public String getContactPersonEmail() {
		return contactPersonEmail;
	}
	public void setContactPersonEmail(String contactPersonEmail) {
		this.contactPersonEmail = contactPersonEmail;
	}
	public String getContactPersonPhone() {
		return contactPersonPhone;
	}
	public void setContactPersonPhone(String contactPersonPhone) {
		this.contactPersonPhone = contactPersonPhone;
	}
	public String getPartnerPaymentType() {
		return partnerPaymentType;
	}
	public void setPartnerPaymentType(String partnerPaymentType) {
		this.partnerPaymentType = partnerPaymentType;
	}
	public BankDetail getBankDetail() {
		return bankDetail;
	}
	public void setBankDetail(BankDetail bankDetail) {
		this.bankDetail = bankDetail;
	}	
}
