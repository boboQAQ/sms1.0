package com.briup.app02.bean;

public class Question {
	public  Question() {}
	public  Question(Long id,String name,String questiontype) {
		this.id=id;
		this.name=name;
		this.questiontype=questiontype;
	}
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQuestiontype() {
		return questiontype;
	}
	public void setQuestiontype(String questiontype) {
		this.questiontype = questiontype;
	}
	private String name;
	private String questiontype;
}
