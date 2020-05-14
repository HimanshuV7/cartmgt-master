package com.capgemini.go.cartms.dao;

import com.capgemini.go.cartms.dto.CartDTO;
import com.capgemini.go.cartms.dto.OrderDTO;
import com.capgemini.go.cartms.dto.OrderProductMapDTO;
import com.capgemini.go.cartms.dto.ProductUINMapDTO;
import com.capgemini.go.cartms.entities.Cart;
import com.capgemini.go.cartms.entities.Order;
import com.capgemini.go.cartms.entities.OrderProductMap;
import com.capgemini.go.cartms.entities.ProductUINMap;
import com.capgemini.go.cartms.exceptions.CartException;
import com.capgemini.go.cartms.exceptions.InValidException;
import com.capgemini.go.cartms.exceptions.OrderException;
import com.capgemini.go.cartms.exceptions.OrderProductMapException;
import com.capgemini.go.cartms.exceptions.ProductUNIMapException;
import com.capgemini.go.cartms.util.CartUtil;
import com.capgemini.go.cartms.util.OrderProductMapUtil;
import com.capgemini.go.cartms.util.OrderUtil;
import com.capgemini.go.cartms.util.ProductUNIMapUtil;
import com.capgemini.go.productmanagement.dto.ProductDTO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.go.dto.OrderProductMapDTO;

public interface OrderProductMapDao extends JpaRepository<OrderProductMapDTO, String> {


}