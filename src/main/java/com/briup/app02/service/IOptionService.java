package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.Option;
import com.briup.app02.bean.vm.OptionVM;

public interface IOptionService {
	List<Option> findOptionAll()throws Exception;
	List<OptionVM> findAllOptionVM()throws Exception;
	Option findOptionById(Long id)throws Exception;
	OptionVM findOptionByIdVM(Long id) throws Exception;
	void updateOption(Option option)throws Exception;
	void saveOption(Option option)throws Exception;
	void deleteOption(Long id)throws Exception;

}
