package com.noqcart.crashmeal.model;

public class OutletProduct {
	private Long outletProductId;
	private Long partnerId;
	private Long productId;
	private Double cost;
	private String imageUrl;
	private String productDesc;
	public Long getOutletProductId() {
		return outletProductId;
	}
	public void setOutletProductId(Long outletProductId) {
		this.outletProductId = outletProductId;
	}
	public Long getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	
}
