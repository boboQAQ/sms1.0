package com.briup.app02.bean;

public class User {
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getHairedate() {
		return hairedate;
	}
	public void setHairedate(String hairedate) {
		this.hairedate = hairedate;
	}
	private String name;
	private String gender;
	private String birth;
	private String hairedate;
}
