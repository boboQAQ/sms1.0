package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Course;
import com.briup.app02.dao.CourseMapper;
import com.briup.app02.service.ICourseService;
@Service
public class CourseServiceImpl implements ICourseService {
	@Autowired
	private CourseMapper courseMapper;

	@Override
	public List<Course> findCourseAll() throws Exception {
		// TODO Auto-generated method stub
		List<Course> list = courseMapper.findCourseAll();
		return list;
	}

	@Override
	public Course findCourseById(long id) throws Exception {
		// TODO Auto-generated method stub
		Course course = courseMapper.findCourseById(id);
		if(course!=null) {
			return course;
		}
		else {
			throw new Exception("id不存在");
		}
	}

	@Override
	public void updateCourse(Course course) throws Exception {
		// TODO Auto-generated method stub
		courseMapper.updateCourse(course);
		
	}

	@Override
	public void insertCourse(Course course) throws Exception {
		// TODO Auto-generated method stub

			courseMapper.insertCourse(course);

		
	}

	@Override
	public void deteleCourse(long id) throws Exception {
		// TODO Auto-generated method stub
		Course course = courseMapper.findCourseById(id);
		if(course!=null) {
			courseMapper.deleteCourse(id);
		}else
		{
			throw new Exception("id不存在");
		}
	}

	


}
