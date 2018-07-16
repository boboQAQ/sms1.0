package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.User;

public interface IUserService {
	List<User> findUserAll()throws Exception;
	User findUserById(Long id)throws Exception;
	void updateUser(User user)throws Exception;
	void saveUser(User user)throws Exception;
	void deleteUser(Long id)throws Exception;
}
