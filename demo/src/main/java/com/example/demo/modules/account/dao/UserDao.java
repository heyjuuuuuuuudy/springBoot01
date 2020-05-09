package com.example.demo.modules.account.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.modules.account.entity.User;
import com.example.demo.modules.test.entity.City;

/*
 * 如果没有@Options 返回来的数据id为0 但数据插入成功
 * 加入@Options 返回正确id
 */

@Mapper
public interface UserDao {
	@Insert("INSERT INTO `user` (user_name,password,create_date) VALUES (#{userName},#{password},#{createDate})")
	@Options(useGeneratedKeys=true,keyColumn="user_id",keyProperty="userId")
	void insertUser(User user);
	
	@Delete("DELETE FROM `user` WHERE user_id = #{userId}")
	void deleteUserByuserId(int userId);
	
	@Update("UPDATE `user` SET user_name= #{userName} WHERE user_id=#{userId}")
	void updateUserByuserId(User user);
	
	@Select("SELECT * FROM `user` WHERE user_id= #{userId}")
	User selectUserByuserId(int userId);
	
}
