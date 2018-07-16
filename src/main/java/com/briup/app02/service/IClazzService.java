package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Clazz;

public interface IClazzService {
	List<Clazz> findClazzAll()throws Exception;
	Clazz findClazzById(Long id)throws Exception;
	void updateClazz(Clazz clazz)throws Exception;
	void saveClazz(Clazz clazz)throws Exception;
	void deleteClazz(Long id)throws Exception;
}
