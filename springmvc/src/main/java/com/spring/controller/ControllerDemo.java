package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class ControllerDemo {
	
	@RequestMapping("/index")
	public String index() {
		return "demo";
	}
	@RequestMapping("/index2")
	public String index2() {
		return "demo2";
	}
	@RequestMapping("/index3")
	public String index3() {
		return "demo3";
	}


}	
