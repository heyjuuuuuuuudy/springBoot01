package com.example.demo.modules.account.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.modules.account.dao.RoleDao;
import com.example.demo.modules.account.dao.UserDao;
import com.example.demo.modules.account.entity.Role;
import com.example.demo.modules.account.entity.User;
import com.example.demo.modules.account.service.RoleService;
import com.example.demo.modules.common.vo.Result;
import com.example.demo.modules.common.vo.Result.ResultEnum;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roledao;
	
	@Override
	@Transactional
	public Result<Role> insertRole(Role role) {
		Result<Role> result = new Result<>(ResultEnum.SUCCESS.status,"insert success");
		roledao.insertRole(role);
		result.setObject(role);
		return result;
	}

	@Override
	@Transactional
	public Result<Role> deleteRoleByroleId(int roleId) {
		Result<Role> result = new Result<>(ResultEnum.SUCCESS.status,"delete success");
		roledao.deleteRoleByroleId(roleId);
		return result;
	}

	@Override
	@Transactional
	public Result<Role> updateRoleByroleId(Role role) {
		Result<Role> result = new Result<>(ResultEnum.SUCCESS.status,"update success");
		roledao.updateRoleByroleId(role);
		return result;
	}

	@Override
	@Transactional
	public Role selectRoleByroleId(int roleId) {
		return roledao.selectRoleByroleId(roleId);
	}


}
