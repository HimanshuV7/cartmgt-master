package com.capgemini.go.cartms.dao;

import com.capgemini.go.cartms.dto.CartDTO;
import com.capgemini.go.cartms.dto.OrderDTO;
import com.capgemini.go.cartms.dto.OrderProductMapDTO;
import com.capgemini.go.cartms.dto.ProductUINMapDTO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.go.dto.OrderDTO;

public interface OrderDao extends JpaRepository<OrderDTO, Integer> {
	 List<OrderDTO> findByUserId(String userId);


}



