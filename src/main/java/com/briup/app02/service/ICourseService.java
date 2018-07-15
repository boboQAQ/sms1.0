package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Course;

public interface ICourseService {
	List<Course> findCourseAll()throws Exception;
	Course findCourseById(Long id)throws Exception;
	void updateCourse(Course course)throws Exception;
	void insertCourse(Course course)throws Exception;
	void deleteCourse(Long id)throws Exception;
}
