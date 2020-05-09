package com.example.demo.modules.account.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.modules.account.entity.Resource;

@Mapper
public interface ResourceDao {
	@Insert("INSERT INTO resource (resource_uri,resource_name,permission) VALUES (#{resourceUri},#{resourceName},#{permission})")
	@Options(useGeneratedKeys=true,keyColumn="resource_id",keyProperty="resourceId")
	void insertResource(Resource resource);
	
	@Delete("DELETE FROM resource WHERE resource_id = #{resourceId}")
	void deleteResourceByresourceId(int resourceId);
	
	@Update("UPDATE Resource SET resource_name=#{resourceName} WHERE resource_id=#{resourceId}")
	void updateResourceByresourceId(Resource Resource);
	
	@Select("SELECT * FROM Resource WHERE resource_id= #{resourceId}")
	Resource selectResourceByresourceId(int resourceId);
}
