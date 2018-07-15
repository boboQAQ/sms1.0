package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Questionnaire;

public interface IQuestionnaireService {
	List<Questionnaire> findQuestionnaireAll()throws Exception;
	Questionnaire findQuestionnaireById(Long id)throws Exception;
	void updateQuestionnaire(Questionnaire questionnaire)throws Exception;
	void insertQuestionnaire(Questionnaire questionnaire)throws Exception;
	void deleteQuestionnaire(Long id)throws Exception;
}
