package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Survey;

public interface ISurveyService {
	List<Survey> findSurveyAll()throws Exception;
	Survey findSurveyById(Long id)throws Exception;
	void updateSurvey(Survey survey)throws Exception;
	void saveSurvey(Survey survey)throws Exception;
	void deleteSurvey(Long id)throws Exception;
}
