package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Clazz;

public interface ClazzMapper {
	List<Clazz> findClazzAll();
	Clazz findClazzById(Long id);
	void updateClazz(Clazz clazz);
	void insertClazz(Clazz clazz);
	void deleteClazz(Long id);
}