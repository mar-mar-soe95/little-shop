package com.mms.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
	
	@RequestMapping({"", "/login"})
	public String showLoginPage() {
		
		return "index1";
		
	}

}
