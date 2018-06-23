package com.noqcart.crashmeal.model;

public class Product {
	private Long productId;
	private String productName;
	private boolean isVeg;
	private Long productCategoryId;
	private Long productSubCategoryId;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public boolean isVeg() {
		return isVeg;
	}
	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}
	public Long getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public Long getProductSubCategoryId() {
		return productSubCategoryId;
	}
	public void setProductSubCategoryId(Long productSubCategoryId) {
		this.productSubCategoryId = productSubCategoryId;
	}
	
	
}
