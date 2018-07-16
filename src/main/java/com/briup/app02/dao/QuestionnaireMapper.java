package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Questionnaire;



public interface QuestionnaireMapper {
	List<Questionnaire> findQuestionnaireAll();
	Questionnaire findQuestionnaireById(Long id);
	void updateQuestionnaire(Questionnaire questionnaire);
	void saveQuestionnaire(Questionnaire questionnaire);
	void deleteQuestionnaire(Long id);
}
