package com.capgemini.go.cartms.controller;

import java.util.Date;
import java.util.Map;

import com.capgemini.go.cartms.dto.CartDTO;
import com.capgemini.go.cartms.dto.OrderDTO;
import com.capgemini.go.cartms.entities.Cart;
import com.capgemini.go.cartms.entities.Order;
import com.capgemini.go.cartms.service.OrderAndCartService;
import com.capgemini.go.cartms.service.OrderAndCartServiceImpl;
import com.capgemini.go.cartms.util.CartUtil;
import com.capgemini.go.cartms.util.OrderUtil;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.go.dto.CartDTO;
import com.cg.go.service.OrderServiceImpl;

@RestController
@RequestMapping("/Order")
@CrossOrigin(origins = "https://localhost:4200")
public class OrderController {

	@Autowired
	private OrderServiceImpl service;

	public OrderServiceImpl getService() {
		return service;
	}

	public void setService(OrderServiceImpl service) {
		this.service = service;
	}

	@PostMapping("/AddToCart")
	public String addItemToCart(@RequestBody CartDTO cart) {
		if ((service.addItemToCart(cart))) {
			return "Added Sucessfully";
		} else
			return "Unsucessful";
	}

	@DeleteMapping("/DeleteOrderProductMapEntity/{orderId}")
	public String deleteOrderProductMapEntity(@PathVariable("orderId") String orderId) {
		if ((service.deleteOrderProductMapEntity(orderId))) {
			return "Cancelled the order Sucessfully";
		} else
			return "Unsucessful";
	}
	
	@GetMapping("/GetOrderAndCartService/{userId}")
	public Object getOrderAndCartService(@PathVariable("userId") String userId)
    { return service.getOrderAndCartService(userId);
	     }
	     
	
		
	
	

	@DeleteMapping("/RemoveItemFromCart/{productId}/{userId}")
	public String removeItemFromCart(@PathVariable("productId") String productId,
			@PathVariable("userId") String userId) {
		if ((service.removeItemFromCart(productId, userId))) {
			return "removed the Item from cart Sucessfully";
		} else
			return "Given product,does not exist the cart";
	}
}
