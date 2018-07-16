package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.School;

public interface SchoolMapper {
	List<School> findSchoolAll();
	School findSchoolById(Long id);
	void updateSchool(School school);
	void saveSchool(School school);
	void deleteSchool(Long id);

}
