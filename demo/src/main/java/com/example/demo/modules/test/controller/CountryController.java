package com.example.demo.modules.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modules.test.entity.Country;
import com.example.demo.modules.test.service.CountryService;


/*
 * @RequestParam 获取问号后面键值对信息
 * @PathVariable 获取数值
 */
@RestController
@RequestMapping("/api")
public class CountryController {

	@Autowired
	private CountryService countryService ;
	
	@RequestMapping( "/country/{countryId}")
	public Country getCountryById(@PathVariable int countryId) {
	return countryService.getCountryById(countryId);
	}
	
	/*
	 * https://localhost/api/country?countryName=China
	 */
	@RequestMapping("/country")
	public Country getCountryByName(@RequestParam String countryName) {
	return countryService.getCountryByName(countryName);
	}
}
