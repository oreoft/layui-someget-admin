package com.someget.admin.common.base;

import com.someget.admin.common.sys.service.MenuService;
import com.someget.admin.common.sys.service.RoleService;
import com.someget.admin.common.sys.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author zyf
 * @date 2022-03-25 20:03
 */
public class BaseController {
	@Autowired
	protected UserService userService;

	@Autowired
	protected MenuService menuService;

	@Autowired
	protected RoleService roleService;

}
