package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Course;
import com.briup.app02.service.ICourseService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private ICourseService courseService;
	@GetMapping("findCourseAll")
	public MsgResponse findCourseAll() {
		try {
			List<Course> list = courseService.findCourseAll();
			return MsgResponse.success("查询成功",list );
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findCourseById")
	public MsgResponse findCourseById(Long id) {
		try {
			Course course = courseService.findCourseById(id);
			return MsgResponse.success("查询成功", course);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updateCourse")
	public MsgResponse updateCourse(Course course) {
		try {
			courseService.updateCourse(course);
			return MsgResponse.success("更新成功", course);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveCourse")
	public MsgResponse saveCourse(Course course) {
		try {
			courseService.saveCourse(course);
			return MsgResponse.success("保存成功", course);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("deleteCourse")
	public MsgResponse deleteCourse(Long id) {
		try {
			courseService.deleteCourse(id);
			return MsgResponse.success("删除成功", null);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}


}
