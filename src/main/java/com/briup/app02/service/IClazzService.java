package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Clazz;
import com.briup.app02.bean.vm.ClazzVM;

public interface IClazzService {
	List<Clazz> findClazzAll()throws Exception;
	List<ClazzVM> findAllClazzVM()throws Exception;
	ClazzVM findClazzByIdVM(Long id)throws Exception; 
	Clazz findClazzById(Long id)throws Exception;
	void updateClazz(Clazz clazz)throws Exception;
	void saveClazz(Clazz clazz)throws Exception;
	void deleteClazz(Long id)throws Exception;
}
