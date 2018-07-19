package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Course;
import com.briup.app02.dao.CourseMapper;
import com.briup.app02.service.ICourseService;
@Service
public class CourseServiceImpl implements ICourseService{
	@Autowired
	private CourseMapper courseMapper;

	@Override
	public List<Course> findCourseAll() throws Exception {
		// TODO Auto-generated method stub
		List<Course> list=courseMapper.findCourseAll();
		if(!list.isEmpty()) {
			return list;
		}else
		{
			throw new Exception("poll_course为空");
		}
	}

	@Override
	public Course findCourseById(Long id) throws Exception {
		// TODO Auto-generated method stub
		Course course =courseMapper.findCourseById(id);
		if(course!=null) {
			return course;
		}else
		{
			throw new Exception("id不存在");
		}
	}

	@Override
	public void updateCourse(Course course) throws Exception {
		// TODO Auto-generated method stub
		Course course2 = courseMapper.findCourseById(course.getId());
		if(course2!=null) {
			courseMapper.updateCourse(course);
		}else {
			throw new Exception("此id不存在");
		}
		
		
	}

	@Override
	public void saveCourse(Course course) throws Exception {
		// TODO Auto-generated method stub
		Course course2 = courseMapper.findCourseById(course.getId());
		if(course2==null) {
			courseMapper.saveCourse(course);
		}
		else
		{
			throw new Exception("此学生信息已存在");
		}
		
	}

	@Override
	public void deleteCourse(Long id) throws Exception {
		// TODO Auto-generated method stub
		Course course = courseMapper.findCourseById(id);
		if(course!=null) {
			courseMapper.deleteCourse(id);
		}
		else {
			throw new Exception("此id不存在");
		}
		
	}

}
