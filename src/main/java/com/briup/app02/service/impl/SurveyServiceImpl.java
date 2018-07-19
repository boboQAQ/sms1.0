package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Survey;
import com.briup.app02.bean.vm.SurveyVM;
import com.briup.app02.dao.SurveyMapper;
import com.briup.app02.dao.extend.SurveyVMMapper;
import com.briup.app02.service.ISurveyService;
@Service
public class SurveyServiceImpl implements ISurveyService{
	@Autowired
	private SurveyMapper surveyMapper;
	@Autowired
	private SurveyVMMapper surveyVMMapper;

	@Override
	public List<Survey> findSurveyAll() throws Exception {
		// TODO Auto-generated method stub
		List<Survey> list=surveyMapper.findSurveyAll();
		if(!list.isEmpty()) {
			return list;
		}else
		{
			throw new Exception("poll_survey为空");
		}
	}

	@Override
	public Survey findSurveyById(Long id) throws Exception {
		// TODO Auto-generated method stub
		Survey survey =surveyMapper.findSurveyById(id);
		if(survey!=null) {
			return survey;
		}else
		{
			throw new Exception("id不存在");
		}
	}

	@Override
	public void updateSurvey(Survey survey) throws Exception {
		// TODO Auto-generated method stub
		Survey survey2 = surveyMapper.findSurveyById(survey.getId());
		if(survey2!=null) {
			surveyMapper.updateSurvey(survey);
		}else {
			throw new Exception("此id不存在");
		}
		
		
	}

	@Override
	public void saveSurvey(Survey survey) throws Exception {
		// TODO Auto-generated method stub
		Survey survey2 = surveyMapper.findSurveyById(survey.getId());
		if(survey2==null) {
			surveyMapper.saveSurvey(survey);
		}
		else
		{
			throw new Exception("此学生信息已存在");
		}
		
	}

	@Override
	public void deleteSurvey(Long id) throws Exception {
		// TODO Auto-generated method stub
		Survey survey = surveyMapper.findSurveyById(id);
		if(survey!=null) {
			surveyMapper.deleteSurvey(id);
		}
		else {
			throw new Exception("此id不存在");
		}
		
	}

	@Override
	public List<SurveyVM> findAllSurveyVM() throws Exception {
		// TODO Auto-generated method stub
		List<Survey> list=surveyMapper.findSurveyAll();
		if(!list.isEmpty()) {
			return surveyVMMapper.findAllSurveyVM();
		}else
		{
			throw new Exception("poll_survey为空");
		}
	}

	@Override
	public SurveyVM findSurveyByIdVM(Long id) throws Exception {
		// TODO Auto-generated method stub
		Survey survey =surveyMapper.findSurveyById(id);
		if(survey!=null) {
			return surveyVMMapper.findSurveyByIdVM(id);
		}else
		{
			throw new Exception("id不存在");
		}
	}

}
