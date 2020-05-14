package com.capgemini.go.cartms.dto;

public class OrderProductMapDTO {

	
	private String orderId;
	
	private String productId;
	
	private String productUIN; 
	
	private int productStatus;
	
	private int giftStatus;

	

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

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

	public int getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(int productStatus) {
		this.productStatus = productStatus;
	}

	public int getGiftStatus() {
		return giftStatus;
	}

	public void setGiftStatus(int giftStatus) {
		this.giftStatus = giftStatus;
	}

	@Override
	public String toString() {
		return "OrderProductMapDTO [orderId=" + orderId + ", productId=" + productId + ", productUIN=" + productUIN
				+ ", productStatus=" + productStatus + ", giftStatus=" + giftStatus + "]";
	}

	
}
