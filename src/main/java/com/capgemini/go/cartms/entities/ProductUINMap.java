package com.capgemini.go.cartms.entities;

public class ProductUINMap {
	

	
	private String productId;
	
	private String productUIN;
	 
	private Boolean productIsPresent;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductUIN() {
		return productUIN;
	}

	public void setProductUIN(String productUIN) {
		this.productUIN = productUIN;
	}

	public Boolean getProductIsPresent() {
		return productIsPresent;
	}

	public void setProductIsPresent(Boolean productIsPresent) {
		this.productIsPresent = productIsPresent;
	}

	@Override
	public String toString() {
		return "ProductUNIMapDTO [productId=" + productId + ", productUIN=" + productUIN + ", productIsPresent="
				+ productIsPresent + "]";
	}

	



}
