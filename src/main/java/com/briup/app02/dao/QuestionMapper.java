package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Question;



public interface QuestionMapper {
	List<Question> findQuestionAll();
	Question findQuestionById(Long id);
	void updateQuestion(Question question);
	void insertQuestion(Question question);
	void deleteQquestion(Long id);
}
