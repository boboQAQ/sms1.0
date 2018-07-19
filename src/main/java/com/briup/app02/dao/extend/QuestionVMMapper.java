package com.briup.app02.dao.extend;

import java.util.List;

import com.briup.app02.bean.vm.QuestionVM;

public interface QuestionVMMapper {
	List<QuestionVM> findAllQuestionVM();
	QuestionVM findQuestionByIdVM(Long id);

}
