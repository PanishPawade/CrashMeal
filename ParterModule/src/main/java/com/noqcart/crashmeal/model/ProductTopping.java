package com.noqcart.crashmeal.model;

public class ProductTopping {
	private Long productToppingId;
	private Long outletProductId;
	private String toppingsName;
	private String desc;
	private Double cost;
	public Long getProductToppingId() {
		return productToppingId;
	}
	public void setProductToppingId(Long productToppingId) {
		this.productToppingId = productToppingId;
	}
	public Long getOutletProductId() {
		return outletProductId;
	}
	public void setOutletProductId(Long outletProductId) {
		this.outletProductId = outletProductId;
	}
	public String getToppingsName() {
		return toppingsName;
	}
	public void setToppingsName(String toppingsName) {
		this.toppingsName = toppingsName;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	
}
