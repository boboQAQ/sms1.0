package com.briup.app02.dao.extend;

import java.util.List;

import com.briup.app02.bean.vm.SurveyVM;

public interface SurveyVMMapper {
	List<SurveyVM> findAllSurveyVM();
	SurveyVM findSurveyByIdVM(Long id);

}
