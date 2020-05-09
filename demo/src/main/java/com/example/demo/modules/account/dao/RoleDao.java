package com.example.demo.modules.account.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.modules.account.entity.Role;
import com.example.demo.modules.account.entity.User;

@Mapper
public interface RoleDao {
	
	@Insert("INSERT INTO role (role_name) VALUES (#{roleName})")
	@Options(useGeneratedKeys=true,keyColumn="role_id",keyProperty="roleId")
	void insertRole(Role role);
	
	@Delete("DELETE FROM role WHERE role_id = #{roleId}")
	void deleteRoleByroleId(int roleId);
	
	@Update("UPDATE role SET role_name=#{roleName} WHERE role_id=#{roleId}")
	void updateRoleByroleId(Role role);
	
	@Select("SELECT * FROM role WHERE role_id= #{roleId}")
	Role selectRoleByroleId(int roleId);
}
