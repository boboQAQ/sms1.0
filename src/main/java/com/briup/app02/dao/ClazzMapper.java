package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Clazz;
import com.briup.app02.bean.vm.ClazzVM;

public interface ClazzMapper {
	List<Clazz> findClazzAll();
	Clazz findClazzById(Long id);
	void updateClazz(Clazz clazz);
	void saveClazz(Clazz clazz);
	void deleteClazz(Long id);
}
