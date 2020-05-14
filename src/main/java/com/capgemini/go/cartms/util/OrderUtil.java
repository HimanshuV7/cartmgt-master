package com.capgemini.go.cartms.util;

import com.capgemini.go.cartms.dto.OrderDTO;
import com.capgemini.go.cartms.entities.Order;

public class OrderUtil {
	
	public static Order convertToOrder(OrderDTO orderDTO) {
		
		Order order  = new Order();
		order.setAddressID(orderDTO.getAddressID());
		order.setOrderDispatchDate(orderDTO.getOrderDispatchDate());
		order.setOrderDispatchStatus(orderDTO.getOrderDispatchStatus());
		order.setOrderID(orderDTO.getOrderID());
		order.setOrderInitiateDate(orderDTO.getOrderInitiateDate());
		order.setUserId(orderDTO.getUserId());
		return order;
		
	}
	
    public static OrderDTO convertToOrderDTO(Order order) {
		
    	OrderDTO orderDTO  = new OrderDTO();
    	orderDTO.setAddressID(order.getAddressID());
    	orderDTO.setOrderDispatchDate(order.getOrderDispatchDate());
    	orderDTO.setOrderDispatchStatus(order.getOrderDispatchStatus());
    	orderDTO.setOrderID(order.getOrderID());
    	orderDTO.setOrderInitiateDate(order.getOrderInitiateDate());
    	orderDTO.setUserId(order.getUserId());
		return orderDTO;
		
	}

}
