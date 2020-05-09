package com.example.demo.modules.account.service;

import com.example.demo.modules.account.entity.User;
import com.example.demo.modules.common.vo.Result;

public interface UserService {
	Result<User> insertUser(User user);
	
	Result<User> deleteUserByuserId(int userId);
	
	Result<User> updateUserByuserId(User user);
	
	User selectUserByuserId(int userId);
}
