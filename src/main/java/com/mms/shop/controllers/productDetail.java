package com.mms.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class productDetail {
	
	@RequestMapping("/detail")
	public String getProductDetail() {
		return "product_detail";
	}

}
