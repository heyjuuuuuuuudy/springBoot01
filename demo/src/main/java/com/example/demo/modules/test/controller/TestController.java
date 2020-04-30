package com.example.demo.modules.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.modules.test.vo.ConfigBean;

@Controller
public class TestController {
	/*
	 * 关于全局配置文件的读写 直接用vlaue 不用@PropertySource
	 * 非全局配置文件要用
	 */
	
	/*
	 * 在哪个类里面引入的 就用那个类的类模板
	 */
	private final static Logger LOGGER = LoggerFactory.getLogger(TestController.class);
	
	
	 public TestController() {
		// TODO Auto-generated constructor stub
	}
	 
	@Value("${server.port}")
	private int port;
	@Value("${name}")
	private String name;
	@Value("${age}")
	private int age;
	@Value("${desc}")
	private String desc;
	@Value("${random}")
	private String random;
	
	/*
	 * 注入
	 */
	@Autowired
	private ConfigBean configBean;
	
	/*
	 * http://localhost/test/config
	 */
	
	@RequestMapping("/test/config")
	@ResponseBody
	public String configTest(){
		StringBuffer sbf = new StringBuffer();
		sbf.append(port).append("---222222222222222222222222222222")
		.append(name).append("---")
		.append(age).append("---")
		.append(desc).append("---")
		.append(random).append("---").append("</br>");
		
		sbf.append(configBean.getPort()).append("---")
		.append(configBean.getName()).append("---")
		.append(configBean.getAge()).append("---")
		.append(configBean.getDesc()).append("---")
		.append(configBean.getRandom()).append("---")
		;
		return sbf.toString();
	}
	
	/*
	 * http://localhost/test/appDesc
	 */
	@RequestMapping("/test/appDesc")
	@ResponseBody
	public String MyMethod() {
		//ResponseBody--该方法是个接口 不是view
		return "HI SPRING BOOT!!!!!!!!!!!";
	}
	
	/*
	 * http://localhost/test/log
	 */
	@RequestMapping("/test/log")
	@ResponseBody
	public String logTest() {
		//ResponseBody--该方法是个接口 不是view
		LOGGER.trace("+++++++++TARCE LOG+++++++++");
		LOGGER.debug("+++++++++TARCE DEBUG+++++++++");
		LOGGER.info("+++++++++TARCE INFO+++++++++");
		LOGGER.warn("+++++++++TARCE WARN+++++++++");
		LOGGER.error("+++++++++TARCE ERROR+++++++++");
		return "================this is logback============";
	}
}
