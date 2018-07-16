package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Grade;

public interface GradeMapper {
	List<Grade> findGradeAll();
	Grade findGradeById(Long id);
	void updateGrade(Grade grade);
	void saveGrade(Grade grade);
	void deleteGrade(Long id);
}
