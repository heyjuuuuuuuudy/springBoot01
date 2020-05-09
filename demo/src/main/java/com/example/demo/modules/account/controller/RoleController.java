package com.example.demo.modules.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modules.account.entity.Role;
import com.example.demo.modules.account.entity.User;
import com.example.demo.modules.account.service.ResourceService;
import com.example.demo.modules.account.service.RoleService;
import com.example.demo.modules.account.service.UserService;
import com.example.demo.modules.common.vo.Result;

@RestController
@RequestMapping("/api")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	@PostMapping(value="/role",consumes="application/json")
	public Result<Role> insertRole(@RequestBody Role role){
		return roleService.insertRole(role);
	}
	
	@DeleteMapping("/role/{roleId}")
	public Result<Role> deleteRoleByroleId(@PathVariable int roleId){
		return roleService.deleteRoleByroleId(roleId);
	}
	
	@PutMapping(value="/role",consumes="application/x-www-form-urlencoded")
	public Result<Role> updateRoleByroleId(Role role){
		return roleService.updateRoleByroleId(role);
	}
	
	@RequestMapping("/role/{roleId}")
	public Role selectRoleByroleId(@PathVariable int roleId){
		return roleService.selectRoleByroleId(roleId);
	}
}
