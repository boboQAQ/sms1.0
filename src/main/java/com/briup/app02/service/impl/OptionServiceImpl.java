package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Option;
import com.briup.app02.bean.vm.OptionVM;
import com.briup.app02.dao.OptionMapper;
import com.briup.app02.dao.extend.OptionVMMapper;
import com.briup.app02.service.IOptionService;
@Service
public class OptionServiceImpl implements IOptionService{
	@Autowired
	private OptionMapper optionMapper;
	@Autowired
	private OptionVMMapper optionVMMapper;

	@Override
	public List<Option> findOptionAll() throws Exception {
		// TODO Auto-generated method stub
		List<Option> list=optionMapper.findOptionAll();
		if(!list.isEmpty()) {
			return list;
		}else
		{
			throw new Exception("poll_option为空");
		}
	}

	@Override
	public Option findOptionById(Long id) throws Exception {
		// TODO Auto-generated method stub
		Option option =optionMapper.findOptionById(id);
		if(option!=null) {
			return option;
		}else
		{
			throw new Exception("id不存在");
		}
	}

	@Override
	public void updateOption(Option option) throws Exception {
		// TODO Auto-generated method stub
		Option option2 = optionMapper.findOptionById(option.getId());
		if(option2!=null) {
			optionMapper.updateOption(option);
		}else {
			throw new Exception("此id不存在");
		}
		
		
	}

	@Override
	public void saveOption(Option option) throws Exception {
		// TODO Auto-generated method stub
		Option option2 = optionMapper.findOptionById(option.getId());
		if(option2==null) {
			optionMapper.saveOption(option);
		}
		else
		{
			throw new Exception("此学生信息已存在");
		}
		
	}

	@Override
	public void deleteOption(Long id) throws Exception {
		// TODO Auto-generated method stub
		Option option = optionMapper.findOptionById(id);
		if(option!=null) {
			optionMapper.deleteOption(id);
		}
		else {
			throw new Exception("此id不存在");
		}
		
	}

	@Override
	public List<OptionVM> findAllOptionVM() throws Exception {
		// TODO Auto-generated method stub
		return optionVMMapper.findAllOptionVM();
	}

	@Override
	public OptionVM findOptionByIdVM(Long id) throws Exception {
	
		Option option =optionMapper.findOptionById(id);
		if(option!=null) {
			return optionVMMapper.findOptionByIdVM(id);
		}else
		{
			throw new Exception("id不存在");
		}
	}

}
