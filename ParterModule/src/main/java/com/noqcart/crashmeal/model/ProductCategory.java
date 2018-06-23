package com.noqcart.crashmeal.model;

public class ProductCategory {
	private Long productCategoryId;
	private String productCategoryName;
	private Long menuId;
	private boolean hasSubCategory;
	public Long getProductCategoryId() {
		return productCategoryId;
	}
	public void setProductCategoryId(Long productCategoryId) {
		this.productCategoryId = productCategoryId;
	}
	public String getProductCategoryName() {
		return productCategoryName;
	}
	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	public boolean isHasSubCategory() {
		return hasSubCategory;
	}
	public void setHasSubCategory(boolean hasSubCategory) {
		this.hasSubCategory = hasSubCategory;
	}
	
	
}
