package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.School;

public interface ISchoolService {
	List<School> findSchoolAll()throws Exception;
	School findSchoolById(Long id)throws Exception;
	void updateSchool(School school)throws Exception;
	void insertSchool(School school)throws Exception;
	void deleteSchool(Long id)throws Exception;
}
