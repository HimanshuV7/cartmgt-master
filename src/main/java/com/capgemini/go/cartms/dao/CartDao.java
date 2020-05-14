package com.capgemini.go.cartms.dao;

import java.util.HashMap;

import java.util.Map;

import com.capgemini.go.cartms.entities.Cart;
import com.capgemini.go.cartms.entities.Order;
import com.capgemini.go.cartms.entities.OrderProductMap;
import com.capgemini.go.cartms.entities.ProductUINMap;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.go.dto.CartDTO;


public interface CartDao extends JpaRepository<CartDTO, String> {

	@Query("select m.userId from CartDTO m where m.userId=?1")
	CartDTO exists(String userId);

	

}
