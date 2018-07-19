package com.briup.app02.bean.vm;

import java.util.List;
import com.briup.app02.bean.vm.QuestionVM;

public class QuestionnaireVM {
	private Long id;
	private String description;
	private String name;
	private String createdate;
	private	List<QuestionVM> questionVM;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public List<QuestionVM> getQuestionVM() {
		return questionVM;
	}
	public void setQuestionVM(List<QuestionVM> questionVM) {
		this.questionVM = questionVM;
	}
	
	

}
