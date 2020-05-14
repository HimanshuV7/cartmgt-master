package com.capgemini.go.cartms.entities;

import java.util.Date;

public class Order {
	

	
	String userId;
	
	String addressID;
   
	String orderID;
	
	byte orderDispatchStatus;
	
	Date orderInitiateDate;
	
	Date orderDispatchDate;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAddressID() {
		return addressID;
	}

	public void setAddressID(String addressID) {
		this.addressID = addressID;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public byte getOrderDispatchStatus() {
		return orderDispatchStatus;
	}

	public void setOrderDispatchStatus(byte orderDispatchStatus) {
		this.orderDispatchStatus = orderDispatchStatus;
	}

	public Date getOrderInitiateDate() {
		return orderInitiateDate;
	}

	public void setOrderInitiateDate(Date orderInitiateDate) {
		this.orderInitiateDate = orderInitiateDate;
	}

	public Date getOrderDispatchDate() {
		return orderDispatchDate;
	}

	public void setOrderDispatchDate(Date orderDispatchDate) {
		this.orderDispatchDate = orderDispatchDate;
	}

	@Override
	public String toString() {
		return "OrderDTO [userId=" + userId + ", addressID=" + addressID + ", orderID=" + orderID
				+ ", orderDispatchStatus=" + orderDispatchStatus + ", orderInitiateDate=" + orderInitiateDate
				+ ", orderDispatchDate=" + orderDispatchDate + "]";
	}

	


}
