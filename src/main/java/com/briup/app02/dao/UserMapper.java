package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.User;



public interface UserMapper {
	List<User> findUserAll();
	User findUserById(Long id);
	void updateUser(User user);
	void saveUser(User user);
	void deleteUser(Long id);
}
