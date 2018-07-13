package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Student;
import com.briup.app02.dao.StudentMapper;
import com.briup.app02.service.IStudentService;
@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	
	
	
	@Override
	public List<Student> findAll() throws Exception {
		//调用studentMapper查询所有学生
		List<Student> list = studentMapper.findAll();
		
		return list;
	}




	@Override
	public Student findById(long id) throws Exception {
		// TODO Auto-generated method stub
		Student student = studentMapper.findById(id);
		if(student!=null) {
			return studentMapper.findById(id);
		}
		else
		{
			
			throw new Exception("查找不存在");
		}
		
		
	}




	@Override
	public void insert(Student student) throws Exception {
		// TODO Auto-generated method stub
		studentMapper.insert(student);
	}




	@Override
	public void update(Student student) throws Exception {
		// TODO Auto-generated method stub
		studentMapper.update(student);
	}




	@Override
	public void delete(long id) throws Exception {
		
		Student student = studentMapper.findById(id);
		if(student!=null) {
			studentMapper.delete(id);
		}
		else
		{
			throw new Exception("删除不存在");
		}
		// TODO Auto-generated method stub
		studentMapper.delete(id);
	}

}
