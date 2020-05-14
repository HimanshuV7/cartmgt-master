package com.capgemini.go.cartms.entities;

public class Cart {

	public Cart() {
		
	}
	
	public static String id(String userID, String productId) {
		String id="uid-"+userID+"-pid-"+productId+"-";
		return id;
	}
	
	private String cartId;

	public Cart(String userID, String productId, int quantity) {
		super();
		this.cartId=id(userID,productId);
		this.userID = userID;
		this.productId = productId;
		this.quantity = quantity;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	private String userID;
	 
	private String productId;
	 
	private int quantity;

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
