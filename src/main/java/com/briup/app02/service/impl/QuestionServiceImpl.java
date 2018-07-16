package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Question;
import com.briup.app02.dao.QuestionMapper;
import com.briup.app02.service.IQuestionService;
@Service
public class QuestionServiceImpl implements IQuestionService{
	@Autowired
	private QuestionMapper questionMapper;

	@Override
	public List<Question> findQuestionAll() throws Exception {
		// TODO Auto-generated method stub
		List<Question> list=questionMapper.findQuestionAll();
		if(!list.isEmpty()) {
			return list;
		}else
		{
			throw new Exception("poll_school为空");
		}
	}

	@Override
	public Question findQuestionById(Long id) throws Exception {
		// TODO Auto-generated method stub
		Question question =questionMapper.findQuestionById(id);
		if(question!=null) {
			return question;
		}else
		{
			throw new Exception("id不存在");
		}
	}

	@Override
	public void updateQuestion(Question question) throws Exception {
		// TODO Auto-generated method stub
		Question question2 = questionMapper.findQuestionById(question.getId());
		if(question2!=null) {
			questionMapper.updateQuestion(question);
		}else {
			throw new Exception("此id不存在");
		}
		
		
	}

	@Override
	public void saveQuestion(Question question) throws Exception {
		// TODO Auto-generated method stub
		Question question2 = questionMapper.findQuestionById(question.getId());
		if(question2==null) {
			questionMapper.saveQuestion(question);
		}
		else
		{
			throw new Exception("此学生信息已存在");
		}
		
	}

	@Override
	public void deleteQuestion(Long id) throws Exception {
		// TODO Auto-generated method stub
		Question question = questionMapper.findQuestionById(id);
		if(question!=null) {
			questionMapper.deleteQuestion(id);
		}
		else {
			throw new Exception("此id不存在");
		}
		
	}

}
