package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Answer;
import com.briup.app02.dao.AnswerMapper;
import com.briup.app02.service.IAnswerService;
@Service
public class AnswerServiceImpl implements IAnswerService{
	@Autowired
	private AnswerMapper answerMapper;

	@Override
	public List<Answer> findAnswerAll() throws Exception {
		// TODO Auto-generated method stub
		List<Answer> list=answerMapper.findAnswerAll();
		if(!list.isEmpty()) {
			return list;
		}else
		{
			throw new Exception("poll_Answer为空");
		}
	}

	@Override
	public Answer findAnswerById(Long id) throws Exception {
		// TODO Auto-generated method stub
		Answer answer =answerMapper.findAnswerById(id);
		if(answer!=null) {
			return answer;
		}else
		{
			throw new Exception("id不存在");
		}
	}

	@Override
	public void updateAnswer(Answer answer) throws Exception {
		// TODO Auto-generated method stub
		Answer answer2 = answerMapper.findAnswerById(answer.getId());
		if(answer2!=null) {
			answerMapper.updateAnswer(answer);
		}else {
			throw new Exception("此id不存在");
		}
		
		
	}

	@Override
	public void saveAnswer(Answer answer) throws Exception {
		// TODO Auto-generated method stub
		Answer answer2 = answerMapper.findAnswerById(answer.getId());
		if(answer2==null) {
			answerMapper.saveAnswer(answer);
		}
		else
		{
			throw new Exception("此学生信息已存在");
		}
		
	}

	@Override
	public void deleteAnswer(Long id) throws Exception {
		// TODO Auto-generated method stub
		Answer answer = answerMapper.findAnswerById(id);
		if(answer!=null) {
			answerMapper.deleteAnswer(id);
		}
		else {
			throw new Exception("此id不存在");
		}
		
	}

}
