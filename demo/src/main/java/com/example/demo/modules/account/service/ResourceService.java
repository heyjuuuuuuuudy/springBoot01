package com.example.demo.modules.account.service;

import com.example.demo.modules.account.entity.Resource;
import com.example.demo.modules.common.vo.Result;

public interface ResourceService {
	Result<Resource> insertResource(Resource resource);

	Result<Resource> deleteResourceByresourceId(int resourceId);

	Result<Resource> updateResourceByresourceId(Resource resource);

	Resource selectResourceByresourceId(int resourceId);
}
