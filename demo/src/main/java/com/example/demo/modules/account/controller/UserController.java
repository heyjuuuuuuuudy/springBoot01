package com.example.demo.modules.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modules.account.entity.User;
import com.example.demo.modules.account.service.UserService;
import com.example.demo.modules.account.service.impl.UserServiceImpl;
import com.example.demo.modules.common.vo.Result;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping(value="/user",consumes="application/json")
	public Result<User> insertUser(@RequestBody User user){
		return userService.insertUser(user);
	}
	
	@DeleteMapping("/user/{userId}")
	public Result<User> deleteUserByuserId(@PathVariable int userId){
		return userService.deleteUserByuserId(userId);
	}
	
	@PutMapping(value="/user",consumes="application/x-www-form-urlencoded")
	public Result<User> updateUserByuserId(User user){
		return userService.updateUserByuserId(user);
	}
	
	@RequestMapping("/user/{userId}")
	public User selectUserByuserId(@PathVariable int userId){
		return userService.selectUserByuserId(userId);
	}
}
