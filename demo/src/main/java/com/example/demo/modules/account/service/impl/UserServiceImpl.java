package com.example.demo.modules.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.modules.account.dao.UserDao;
import com.example.demo.modules.account.entity.User;
import com.example.demo.modules.account.service.UserService;
import com.example.demo.modules.common.vo.Result;
import com.example.demo.modules.common.vo.Result.ResultEnum;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userdao;
	
	@Override
	@Transactional
	public Result<User> insertUser(User user) {
		Result<User> result = new Result<>(ResultEnum.SUCCESS.status,"insert success");
		userdao.insertUser(user);
		result.setObject(user);
		return result;
	}

	@Override
	@Transactional
	public Result<User> deleteUserByuserId(int userId) {
		Result<User> result = new Result<>(ResultEnum.SUCCESS.status,"delete success");
		userdao.deleteUserByuserId(userId);
		return result;
	}

	@Override
	@Transactional
	public Result<User> updateUserByuserId(User user) {
		Result<User> result = new Result<>(ResultEnum.SUCCESS.status,"update success");
		userdao.updateUserByuserId(user);
		return result;
	}

	@Override
	@Transactional
	public User selectUserByuserId(int userId) {
		return userdao.selectUserByuserId(userId);
	}

}
