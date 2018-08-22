package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class ControllerDemo {
	
	@RequestMapping("/index")
	public String index() {
		System.out.println("yonghshangwole");
		return "demo";
	}


}	
