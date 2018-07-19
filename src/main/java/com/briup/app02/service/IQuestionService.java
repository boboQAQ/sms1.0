package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Question;
import com.briup.app02.bean.vm.QuestionVM;

public interface IQuestionService {
	List<QuestionVM> findAllQuestionVM()throws Exception;
	List<Question> findQuestionAll()throws Exception;
	QuestionVM findQuestionByIdVM(Long id)throws Exception;
	Question findQuestionById(Long id)throws Exception;
	void updateQuestion(Question question)throws Exception;
	void saveQuestion(Question question)throws Exception;
	void save_Question(QuestionVM questionVM)throws Exception;
	void deleteQuestion(Long id)throws Exception;
}
