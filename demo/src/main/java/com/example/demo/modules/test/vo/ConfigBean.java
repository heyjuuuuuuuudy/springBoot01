package com.example.demo.modules.test.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
/*
 * @Component注册为spring组件
 * @PropertySource和相应的配置文件绑定
 * @ConfigurationProperties前缀 因为设置了前缀就不用再vlaue了
 * 会自动获取前缀之后的东西
 * 前缀命名规则：不可用驼峰 要么用下划线要么用.
 */
@Component
@PropertySource("classpath:config/applicationTest.properties")
@ConfigurationProperties(prefix = "com.zr")
public class ConfigBean {
	
	private int port;
	private String name;
	private int age;
	private String desc;
	private String random;
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getRandom() {
		return random;
	}
	public void setRandom(String random) {
		this.random = random;
	}
	
	
	
	

}
