package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test/appDesc")
	@ResponseBody
	public String MyMethod() {
		//ResponseBody--该方法是个接口 不是view
		return "HI SPRING BOOT";
	}
}
