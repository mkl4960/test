package com.lau.service;

import java.math.BigDecimal;
import java.math.BigInteger;

import guru.springframework.domain.CreateProductRequest;

public class CreateProductService {

	public CreateProductService() {
		CreateProductRequest req = new CreateProductRequest();
		BigInteger id = new BigInteger("1000");
		req.setProductId(id);
		String desc = "Shampoo";
		req.setProductDescription(desc);
		BigDecimal price = new BigDecimal("10.00");
		req.setProductPrice(price);
		
		req.setApikey("key");
	}
}
