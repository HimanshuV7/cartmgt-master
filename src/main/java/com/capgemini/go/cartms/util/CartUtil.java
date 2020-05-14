package com.capgemini.go.cartms.util;

import com.capgemini.go.cartms.dto.CartDTO;
import com.capgemini.go.cartms.entities.Cart;

public class CartUtil {
	
	public static Cart convertToCart(CartDTO cartDTO) {
		Cart cart = new Cart();
		cart.setProductId(cartDTO.getProductId());
		cart.setUserID(cartDTO.getUserID());
		cart.setQuantity(cartDTO.getQuantity());		
		return cart;
	}
	
	public static CartDTO convertToCartDTO(Cart cart) {
		CartDTO cartDTO = new CartDTO();
		cartDTO.setProductId(cart.getProductId());
		cartDTO.setUserID(cart.getUserID());
		cartDTO.setQuantity(cart.getQuantity());		
		return cartDTO;
	}

}
