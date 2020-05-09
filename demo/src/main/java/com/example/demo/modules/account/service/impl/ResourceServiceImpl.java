package com.example.demo.modules.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.modules.account.dao.ResourceDao;
import com.example.demo.modules.account.entity.Resource;
import com.example.demo.modules.account.service.ResourceService;
import com.example.demo.modules.common.vo.Result;
import com.example.demo.modules.common.vo.Result.ResultEnum;

@Service
public class ResourceServiceImpl implements ResourceService {
	@Autowired
	private ResourceDao resourcedao;
	
	@Override
	@Transactional
	public Result<Resource> insertResource(Resource resource) {
		Result<Resource> result = new Result<>(ResultEnum.SUCCESS.status,"insert success");
		resourcedao.insertResource(resource);
		result.setObject(resource);
		return result;
	}

	@Override
	@Transactional
	public Result<Resource> deleteResourceByresourceId(int resourceId) {
		Result<Resource> result = new Result<>(ResultEnum.SUCCESS.status,"delete success");
		resourcedao.deleteResourceByresourceId(resourceId);
		return result;
	}

	@Override
	@Transactional
	public Result<Resource> updateResourceByresourceId(Resource resource) {
		Result<Resource> result = new Result<>(ResultEnum.SUCCESS.status,"update success");
		resourcedao.updateResourceByresourceId(resource);
		return result;
	}

	@Override
	@Transactional
	public Resource selectResourceByresourceId(int resourceId) {
		return resourcedao.selectResourceByresourceId(resourceId);
	}


}
