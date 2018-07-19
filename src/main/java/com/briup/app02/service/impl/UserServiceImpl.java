package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.User;
import com.briup.app02.dao.UserMapper;
import com.briup.app02.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> findUserAll() throws Exception {
		// TODO Auto-generated method stub
		List<User> list=userMapper.findUserAll();
		if(!list.isEmpty()) {
			return list;
		}else
		{
			throw new Exception("poll_user为空");
		}
	}

	@Override
	public User findUserById(Long id) throws Exception {
		// TODO Auto-generated method stub
		User user =userMapper.findUserById(id);
		if(user!=null) {
			return user;
		}else
		{
			throw new Exception("id不存在");
		}
	}

	@Override
	public void updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		User user2 = userMapper.findUserById(user.getId());
		if(user2!=null) {
			userMapper.updateUser(user);
		}else {
			throw new Exception("此id不存在");
		}
		
		
	}

	@Override
	public void saveUser(User user) throws Exception {
		// TODO Auto-generated method stub
		User user2 = userMapper.findUserById(user.getId());
		if(user2==null) {
			userMapper.saveUser(user);
		}
		else
		{
			throw new Exception("此学生信息已存在");
		}
		
	}

	@Override
	public void deleteUser(Long id) throws Exception {
		// TODO Auto-generated method stub
		User user = userMapper.findUserById(id);
		if(user!=null) {
			userMapper.deleteUser(id);
		}
		else {
			throw new Exception("此id不存在");
		}
		
	}

}
