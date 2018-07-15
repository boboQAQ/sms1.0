package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Question;

public interface IQuestionService {
	List<Question> findQuestionAll()throws Exception;
	Question findQuestionById(Long id)throws Exception;
	void updateQuestion(Question question)throws Exception;
	void insertQuestion(Question question)throws Exception;
	void deleteQquestion(Long id)throws Exception;
}
