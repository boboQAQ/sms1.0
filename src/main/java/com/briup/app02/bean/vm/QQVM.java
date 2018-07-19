package com.briup.app02.bean.vm;


public class QQVM {
	private Long id;
	private QuestionVM questionVM;
	private QuestionnaireVM questionnaireVM;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public QuestionVM getQuestionVM() {
		return questionVM;
	}
	public void setQuestionVM(QuestionVM questionVM) {
		this.questionVM = questionVM;
	}
	public QuestionnaireVM getQuestionnaireVM() {
		return questionnaireVM;
	}
	public void setQuestionnaireVM(QuestionnaireVM questionnaireVM) {
		this.questionnaireVM = questionnaireVM;
	}
	

}
