package com.capgemini.go.cartms.dto;

public class CartDTO {

	private String userID;
	private String productId;
	private int quantity;
	
	
	
	public CartDTO(String userID, String productId, int quantity) {
		super();
		this.userID = userID;
		this.productId = productId;
		this.quantity = quantity;
	}

	public CartDTO() {
	}

	

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartDTO [userID=" + userID + ", productId=" + productId + ", quantity=" + quantity + "]";
	}

	
	 
}
