package com.capgemini.go.cartms.util;

import com.capgemini.go.cartms.dto.OrderProductMapDTO;
import com.capgemini.go.cartms.entities.OrderProductMap;

public class OrderProductMapUtil {
	
	public static OrderProductMap convertToOrderProductMap(OrderProductMapDTO orderProductMapDTO) {
		
		OrderProductMap orderProductMap = new OrderProductMap();
		orderProductMap.setGiftStatus(orderProductMapDTO.getGiftStatus());
		orderProductMap.setProductId(orderProductMapDTO.getProductId());
		orderProductMap.setProductStatus(orderProductMapDTO.getProductStatus());
		orderProductMap.setProductUIN(orderProductMapDTO.getProductUIN());
		orderProductMap.setOrderId(orderProductMapDTO.getOrderId());
		return orderProductMap;
		
	}
	
    public static OrderProductMapDTO convertToOrderProductMapDTO(OrderProductMap orderProductMap) {
		
    	OrderProductMapDTO orderProductMapDTO = new OrderProductMapDTO();
    	orderProductMapDTO.setGiftStatus(orderProductMap.getGiftStatus());
    	orderProductMapDTO.setProductId(orderProductMap.getProductId());
    	orderProductMapDTO.setProductStatus(orderProductMap.getProductStatus());
    	orderProductMapDTO.setProductUIN(orderProductMap.getProductUIN());
    	orderProductMapDTO.setOrderId(orderProductMap.getOrderId());
		return orderProductMapDTO;
		
	}

}
