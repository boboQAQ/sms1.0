package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Answer;

public interface IAnswerService {
	List<Answer> findAnswerAll() throws Exception;
	
	Answer findAnswerById(Long id)throws Exception;
	
	void insertAnswer(Answer answer)throws Exception;

	void updateAnswer (Answer answer)throws Exception;

	void deleteAnswer (long id)throws Exception;

}
