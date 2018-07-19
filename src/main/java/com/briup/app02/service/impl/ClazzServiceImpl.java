package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.Clazz;
import com.briup.app02.bean.vm.ClazzVM;
import com.briup.app02.dao.ClazzMapper;
import com.briup.app02.dao.extend.ClazzVMMapper;
import com.briup.app02.service.IClazzService;
@Service
public class ClazzServiceImpl implements IClazzService{
	@Autowired
	private ClazzMapper clazzMapper;
	@Autowired
	private ClazzVMMapper clazzVMMapper;

	@Override
	public List<Clazz> findClazzAll() throws Exception {
		// TODO Auto-generated method stub
		List<Clazz> list=clazzMapper.findClazzAll();
		if(!list.isEmpty()) {
			return list;
		}else
		{
			throw new Exception("poll_clazz为空");
		}
	}

	@Override
	public Clazz findClazzById(Long id) throws Exception {
		// TODO Auto-generated method stub
		Clazz clazz =clazzMapper.findClazzById(id);
		if(clazz!=null) {
			return clazz;
		}else
		{
			throw new Exception("id不存在");
		}
	}

	@Override
	public void updateClazz(Clazz clazz) throws Exception {
		// TODO Auto-generated method stub
		Clazz clazz2 = clazzMapper.findClazzById(clazz.getId());
		if(clazz2!=null) {
			clazzMapper.updateClazz(clazz);
		}else {
			throw new Exception("此id不存在");
		}
		
		
	}

	@Override
	public void saveClazz(Clazz clazz) throws Exception {
		// TODO Auto-generated method stub
		Clazz clazz2 = clazzMapper.findClazzById(clazz.getId());
		if(clazz2==null) {
			clazzMapper.saveClazz(clazz);
		}
		else
		{
			throw new Exception("此学生信息已存在");
		}
		
	}

	@Override
	public void deleteClazz(Long id) throws Exception {
		// TODO Auto-generated method stub
		Clazz clazz = clazzMapper.findClazzById(id);
		if(clazz!=null) {
			clazzMapper.deleteClazz(id);
		}
		else {
			throw new Exception("此id不存在");
		}
		
	}

	@Override
	public List<ClazzVM> findAllClazzVM() throws Exception {
		// TODO Auto-generated method stub
		return clazzVMMapper.findAllClazzVM();
	}

	@Override
	public ClazzVM findClazzByIdVM(Long id) throws Exception {
		// TODO Auto-generated method stub
		Clazz clazz =clazzMapper.findClazzById(id);
		if(clazz!=null) {
			return clazzVMMapper.findClazzByIdVM(id);
		}
		else
		{
			throw new Exception("id不存在");
		}
	}

}
