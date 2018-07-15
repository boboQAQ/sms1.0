package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Grade;

public interface IGradeService {
	List<Grade> findGradeAll()throws Exception;
	Grade findGradeById(Long id)throws Exception;
	void updateGrade(Grade grade)throws Exception;
	void insertGrade(Grade grade)throws Exception;
	void deleteGrade(Long id)throws Exception;
}
