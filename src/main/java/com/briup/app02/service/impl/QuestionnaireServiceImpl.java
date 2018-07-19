package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Questionnaire;
import com.briup.app02.bean.vm.QuestionnaireVM;
import com.briup.app02.dao.QuestionnaireMapper;
import com.briup.app02.dao.extend.QuestionnaireVMMapper;
import com.briup.app02.service.IQuestionnaireService;
@Service
public class QuestionnaireServiceImpl implements IQuestionnaireService{
	@Autowired
	private QuestionnaireMapper questionnaireMapper;
	@Autowired
	private QuestionnaireVMMapper questionnaireVMMapper;

	@Override
	public List<Questionnaire> findQuestionnaireAll() throws Exception {
		// TODO Auto-generated method stub
		List<Questionnaire> list=questionnaireMapper.findQuestionnaireAll();
		if(!list.isEmpty()) {
			return list;
		}else
		{
			throw new Exception("poll_questionnaire为空");
		}
	}

	@Override
	public Questionnaire findQuestionnaireById(Long id) throws Exception {
		// TODO Auto-generated method stub
		Questionnaire questionnaire =questionnaireMapper.findQuestionnaireById(id);
		if(questionnaire!=null) {
			return questionnaire;
		}else
		{
			throw new Exception("id不存在");
		}
	}

	@Override
	public void updateQuestionnaire(Questionnaire questionnaire) throws Exception {
		// TODO Auto-generated method stub
		Questionnaire questionnaire2 = questionnaireMapper.findQuestionnaireById(questionnaire.getId());
		if(questionnaire2!=null) {
			questionnaireMapper.updateQuestionnaire(questionnaire);
		}else {
			throw new Exception("此id不存在");
		}
		
		
	}

	@Override
	public void saveQuestionnaire(Questionnaire questionnaire) throws Exception {
		// TODO Auto-generated method stub
		Questionnaire questionnaire2 = questionnaireMapper.findQuestionnaireById(questionnaire.getId());
		if(questionnaire2==null) {
			questionnaireMapper.saveQuestionnaire(questionnaire);
		}
		else
		{
			throw new Exception("此学生信息已存在");
		}
		
	}

	@Override
	public void deleteQuestionnaire(Long id) throws Exception {
		// TODO Auto-generated method stub
		Questionnaire questionnaire = questionnaireMapper.findQuestionnaireById(id);
		if(questionnaire!=null) {
			questionnaireMapper.deleteQuestionnaire(id);
		}
		else {
			throw new Exception("此id不存在");
		}
		
	}

	@Override
	public List<QuestionnaireVM> findAllQuestionnaireVM() throws Exception {
		// TODO Auto-generated method stub
		List<Questionnaire> list=questionnaireMapper.findQuestionnaireAll();
		if(!list.isEmpty()) {
			return questionnaireVMMapper.findAllQuestionnaireVM();
		}else
		{
			throw new Exception("poll_questionnaire为空");
		}
	}

	@Override
	public QuestionnaireVM findQuestionnaireByIdVM(Long id) throws Exception {
		// TODO Auto-generated method stub
		Questionnaire questionnaire =questionnaireMapper.findQuestionnaireById(id);
		if(questionnaire!=null) {
			return questionnaireVMMapper.findQuestionnaireByIdVM(id);
		}else
		{
			throw new Exception("id不存在");
		}
	}

}
