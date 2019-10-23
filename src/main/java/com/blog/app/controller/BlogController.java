package com.blog.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
	
	@RequestMapping("/home")
	public String home() {
		return "Welcome to Onyedikachi's Blog";
	}

}
