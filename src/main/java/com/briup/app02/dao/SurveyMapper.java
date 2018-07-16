package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Survey;


public interface SurveyMapper {
	List<Survey> findSurveyAll();
	Survey findSurveyById(Long id);
	void updateSurvey(Survey survey);
	void saveSurvey(Survey survey);
	void deleteSurvey(Long id);
}
