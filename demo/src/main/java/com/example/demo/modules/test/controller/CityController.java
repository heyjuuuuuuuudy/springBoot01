package com.example.demo.modules.test.controller;

import java.util.List;

import org.apache.ibatis.javassist.compiler.Javac.CtFieldWithInit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modules.common.vo.Result;
import com.example.demo.modules.test.entity.City;
import com.example.demo.modules.test.service.CityService;
import com.github.pagehelper.PageInfo;

/*
 * @PathVariable 从路径里获取相应paramter
 * @PostMapping(value="/city") 提交方式为post value相当于path
 * consumes 进入到这个接口的参数类型 表单提交格式application/json（用reaqustbody接收） 还有文件
 */

@RestController
@RequestMapping("/api")
public class CityController {

	@Autowired
	private CityService cityService;

	@RequestMapping("/cities/{countryId}")
	public List<City> getCitiesByCountryId(@PathVariable int countryId) {
		return cityService.getCitiesByCountryId(countryId);
	}

	/*
	 * https://localhost/api/cities?currentPage=1&pageSize=10&countryId=522
	 */
	@RequestMapping("/cities")
	public PageInfo<City> getCitiesByPage(@RequestParam int currentPage,
			@RequestParam int pageSize,
			@RequestParam int countryId) {
		return cityService.getCitiesByPage(currentPage, pageSize, countryId);
	}
	
	@PostMapping(value="/city",consumes="application/json")
	public Result<City> insertCity(@RequestBody City city){
		return cityService.insertCity(city);
	}

}