package com.briup.app02.dao.extend;



import com.briup.app02.bean.vm.QuestionVM;
import com.briup.app02.bean.vm.QuestionnaireVM;


public interface QQVMMapper {
	
	QuestionVM findByQuestionVMId(Long id);
	QuestionnaireVM findByQuestionnaireVMId(Long id);

}
