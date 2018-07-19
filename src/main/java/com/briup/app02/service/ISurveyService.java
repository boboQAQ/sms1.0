package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Survey;
import com.briup.app02.bean.vm.SurveyVM;

public interface ISurveyService {
	List<SurveyVM> findAllSurveyVM()throws Exception;
	List<Survey> findSurveyAll()throws Exception;
	SurveyVM findSurveyByIdVM(Long id)throws Exception;
	Survey findSurveyById(Long id)throws Exception;
	void updateSurvey(Survey survey)throws Exception;
	void saveSurvey(Survey survey)throws Exception;
	void deleteSurvey(Long id)throws Exception;
}
