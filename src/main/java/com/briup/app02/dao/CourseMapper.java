package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Course;

public interface CourseMapper {
	List<Course> findCourseAll();
	Course findCourseById(Long id);
	void updateCourse(Course course);
	void insertCourse(Course course);
	void deleteCourse(Long id);
}
