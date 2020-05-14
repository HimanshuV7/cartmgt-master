package com.capgemini.go.cartms.util;

import com.capgemini.go.cartms.dto.ProductUINMapDTO;
import com.capgemini.go.cartms.entities.ProductUINMap;

public class ProductUNIMapUtil {
	
	public static ProductUINMap convertToProductUNIMap(ProductUINMapDTO productUINMapDTO) {
		ProductUINMap productUINMap = new ProductUINMap();
		productUINMap.setProductId(productUINMapDTO.getProductId());
		productUINMap.setProductIsPresent(productUINMapDTO.getProductIsPresent());
		productUINMap.setProductUIN(productUINMapDTO.getProductUIN());
		return productUINMap;
	}
	
	public static ProductUINMapDTO convertToProductUNIMapDTO(ProductUINMap productUINMap) {
		ProductUINMapDTO productUINMapDTO = new ProductUINMapDTO();
		productUINMapDTO.setProductId(productUINMap.getProductId());
		productUINMapDTO.setProductIsPresent(productUINMap.getProductIsPresent());
		productUINMapDTO.setProductUIN(productUINMap.getProductUIN());
		return productUINMapDTO;
	}

}
