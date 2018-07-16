package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.School;
import com.briup.app02.dao.SchoolMapper;
import com.briup.app02.service.ISchoolService;
@Service
public class SchoolServiceImpl implements ISchoolService{
	@Autowired
	private SchoolMapper schoolMapper;

	@Override
	public List<School> findSchoolAll() throws Exception {
		// TODO Auto-generated method stub
		List<School> list=schoolMapper.findSchoolAll();
		if(!list.isEmpty()) {
			return list;
		}else
		{
			throw new Exception("poll_school为空");
		}
	}

	@Override
	public School findSchoolById(Long id) throws Exception {
		// TODO Auto-generated method stub
		School school =schoolMapper.findSchoolById(id);
		if(school!=null) {
			return school;
		}else
		{
			throw new Exception("id不存在");
		}
	}

	@Override
	public void updateSchool(School school) throws Exception {
		// TODO Auto-generated method stub
		School school2 = schoolMapper.findSchoolById(school.getId());
		if(school2!=null) {
			schoolMapper.updateSchool(school);
		}else {
			throw new Exception("此id不存在");
		}
		
		
	}

	@Override
	public void saveSchool(School school) throws Exception {
		// TODO Auto-generated method stub
		School school2 = schoolMapper.findSchoolById(school.getId());
		if(school2==null) {
			schoolMapper.saveSchool(school);
		}
		else
		{
			throw new Exception("此学生信息已存在");
		}
		
	}

	@Override
	public void deleteSchool(Long id) throws Exception {
		// TODO Auto-generated method stub
		School school = schoolMapper.findSchoolById(id);
		if(school!=null) {
			schoolMapper.deleteSchool(id);
		}
		else {
			throw new Exception("此id不存在");
		}
		
	}

}
