package com.example.demo.modules.account.service;

import com.example.demo.modules.account.entity.Role;
import com.example.demo.modules.account.entity.User;
import com.example.demo.modules.common.vo.Result;

public interface RoleService {
	Result<Role> insertRole(Role role);

	Result<Role> deleteRoleByroleId(int roleId);

	Result<Role> updateRoleByroleId(Role role);

	Role selectRoleByroleId(int roleId);
}
