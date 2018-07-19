package com.briup.app02.dao.extend;

import java.util.List;

import com.briup.app02.bean.vm.QuestionnaireVM;

public interface QuestionnaireVMMapper {
	List<QuestionnaireVM> findAllQuestionnaireVM();
	QuestionnaireVM findQuestionnaireByIdVM(Long id);
}
