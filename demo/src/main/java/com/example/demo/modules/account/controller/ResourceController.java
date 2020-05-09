package com.example.demo.modules.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modules.account.entity.Resource;
import com.example.demo.modules.account.service.ResourceService;
import com.example.demo.modules.common.vo.Result;

@RestController
@RequestMapping("/api")
public class ResourceController {
	@Autowired
	private ResourceService resourceService;
	
	@PostMapping(value="/resource",consumes="application/json")
	public Result<Resource> insertResource(@RequestBody Resource resource){
		return resourceService.insertResource(resource);
	}
	
	@DeleteMapping("/resource/{resourceId}")
	public Result<Resource> deleteResourceByresourceId(@PathVariable int resourceId){
		return resourceService.deleteResourceByresourceId(resourceId);
	}
	
	@PutMapping(value="/resource",consumes="application/x-www-form-urlencoded")
	public Result<Resource> updateResourceByresourceId(Resource resource){
		return resourceService.updateResourceByresourceId(resource);
	}
	
	@RequestMapping("/resource/{resourceId}")
	public Resource selectResourceByresourceId(@PathVariable int resourceId){
		return resourceService.selectResourceByresourceId(resourceId);
	}
}
