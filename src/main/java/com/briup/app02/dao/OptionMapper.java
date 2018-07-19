package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Option;



public interface OptionMapper {
	List<Option> findOptionAll();
	List<Option> findByQuestionId(Long id);
	
	Option findOptionById(Long id);
	void updateOption(Option option);
	void saveOption(Option option);
	void deleteOption(Long id);
}
