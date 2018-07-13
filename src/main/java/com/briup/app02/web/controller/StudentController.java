package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Student;
import com.briup.app02.service.IStudentService;
import com.briup.app02.service.impl.StudentServiceImpl;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/student")
public class StudentController {
	//注入studentService的实例
	@Autowired
	private IStudentService studentService;
	@GetMapping("findAllstudent")
	//http://127.0.0.1:8080/student/findALLstudent
	public MsgResponse findAllstudent(){
		try {
		List<Student> list = studentService.findAll();
		return MsgResponse.success("查询成功", list);
		}catch(Exception e) {
			e.printStackTrace();
			
		}return null;
	}
	@GetMapping("findstudentById")
	public MsgResponse findstudentById(long id) {
		try {
			
			Student student = studentService.findById(id);
			return MsgResponse.success("查询成功", student);
		}catch(Exception e)
		{
			return MsgResponse.error(e.getMessage());
		}
		
	}

	@PostMapping("insertstudent")
	public MsgResponse insertstudent(Student student)
	{
		try {
			studentService.insert(student);
			return MsgResponse.success("保存成功", null);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updatestudent")
	public MsgResponse updatastudent(Student student) {
		try {
			studentService.update(student);
			return MsgResponse.success("修改成功", student);
		}
		catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error( e.getMessage());
		}
	}
	@GetMapping("deletestudent")
	public MsgResponse deletestudent(long id)
	{
		try {
			studentService.delete(id);
			return MsgResponse.success("删除成功", null);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
}
