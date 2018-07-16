package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.User;
import com.briup.app02.service.IUserService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;
	@GetMapping("findUserAll")
	public MsgResponse findUserAll() {
		try {
			List<User> list = userService.findUserAll();
			return MsgResponse.success("查询成功",list );
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findUserById")
	public MsgResponse findUserById(Long id) {
		try {
			User user = userService.findUserById(id);
			return MsgResponse.success("查询成功", user);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updateUser")
	public MsgResponse updateUser(User user) {
		try {
			userService.updateUser(user);
			return MsgResponse.success("更新成功", user);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveUser")
	public MsgResponse saveUser(User user) {
		try {
			userService.saveUser(user);
			return MsgResponse.success("保存成功", user);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("deleteUser")
	public MsgResponse deleteUser(Long id) {
		try {
			userService.deleteUser(id);
			return MsgResponse.success("删除成功", null);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}


}
