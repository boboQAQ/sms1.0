package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Course;

public interface CourseMapper {
	/**
	 * @ 查询所有课程信息
	 * @return
	 * @author 波波
	 */
	List<Course> findCourseAll();
	/**
	 * @按id查询课程信息
	 * @return
	 * @author 波波
	 */
	Course findCourseById(long id);
	/**
	 * @插入课程信息
	 * @return
	 * @author 波波
	 */
	void insertCourse(Course course);
	/**
	 * @更新课程信息
	 * @return
	 * @author 波波
	 */
	void updateCourse (Course course);
	/**
	 * @删除课程信息
	 * @return
	 * @author 波波
	 */
	void deleteCourse (long id);

}
