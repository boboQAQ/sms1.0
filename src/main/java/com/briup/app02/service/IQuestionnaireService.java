package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Questionnaire;
import com.briup.app02.bean.vm.QuestionnaireVM;


public interface IQuestionnaireService {
	List<QuestionnaireVM> findAllQuestionnaireVM()throws Exception;
	List<Questionnaire> findQuestionnaireAll()throws Exception;
	QuestionnaireVM findQuestionnaireByIdVM(Long id)throws Exception;
	Questionnaire findQuestionnaireById(Long id)throws Exception;
	void updateQuestionnaire(Questionnaire questionnaire)throws Exception;
	void saveQuestionnaire(Questionnaire questionnaire)throws Exception;
	void deleteQuestionnaire(Long id)throws Exception;
}
