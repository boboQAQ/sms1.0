package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Grade;

import com.briup.app02.dao.GradeMapper;

import com.briup.app02.service.IGradeService;
@Service
public class GradeServiceImpl implements IGradeService {
	@Autowired
	private GradeMapper gradeMapper;

	@Override
	public List<Grade> findGradeAll() throws Exception {
		// TODO Auto-generated method stub
		List<Grade> list=gradeMapper.findGradeAll();
		if(!list.isEmpty()) {
			return list;
		}else
		{
			throw new Exception("poll_grade为空");
		}
	}

	@Override
	public Grade findGradeById(Long id) throws Exception {
		// TODO Auto-generated method stub
		Grade grade =gradeMapper.findGradeById(id);
		if(grade!=null) {
			return grade;
		}else
		{
			throw new Exception("id不存在");
		}
	}

	@Override
	public void updateGrade(Grade grade) throws Exception {
		// TODO Auto-generated method stub
		Grade grade2 = gradeMapper.findGradeById(grade.getId());
		if(grade2!=null) {
			gradeMapper.updateGrade(grade);
		}else {
			throw new Exception("此id不存在");
		}
		
		
	}

	@Override
	public void saveGrade(Grade grade) throws Exception {
		// TODO Auto-generated method stub
		Grade grade2 = gradeMapper.findGradeById(grade.getId());
		if(grade2==null) {
			gradeMapper.saveGrade(grade);
		}
		else
		{
			throw new Exception("此学生信息已存在");
		}
		
	}

	@Override
	public void deleteGrade(Long id) throws Exception {
		// TODO Auto-generated method stub
		Grade grade = gradeMapper.findGradeById(id);
		if(grade!=null) {
			gradeMapper.deleteGrade(id);
		}
		else {
			throw new Exception("此id不存在");
		}
		
	}


}
