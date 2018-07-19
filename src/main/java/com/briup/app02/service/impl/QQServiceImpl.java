package com.briup.app02.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.app02.bean.QQ;

import com.briup.app02.dao.QQMapper;

import com.briup.app02.service.IQQService;
@Service
public class QQServiceImpl implements IQQService{
	@Autowired
	private QQMapper qqMapper;
	

	@Override
	public List<QQ> findQQAll() throws Exception {
		// TODO Auto-generated method stub
		List<QQ> list=qqMapper.findQQAll();
		if(!list.isEmpty()) {
			return list;
		}else
		{
			throw new Exception("poll_qq为空");
		}
	}

	@Override
	public QQ findQQById(Long id) throws Exception {
		// TODO Auto-generated method stub
		QQ qq =qqMapper.findQQById(id);
		if(qq!=null) {
			return qq;
		}else
		{
			throw new Exception("id不存在");
		}
	}

	@Override
	public void updateQQ(QQ qq) throws Exception {
		// TODO Auto-generated method stub
		QQ qq2 = qqMapper.findQQById(qq.getId());
		if(qq2!=null) {
			qqMapper.updateQQ(qq);
		}else {
			throw new Exception("此id不存在");
		}
		
		
	}

	@Override
	public void saveQQ(QQ qq) throws Exception {
		// TODO Auto-generated method stub
		QQ qq2 = qqMapper.findQQById(qq.getId());
		if(qq2==null) {
			qqMapper.saveQQ(qq);
		}
		else
		{
			throw new Exception("此学生信息已存在");
		}
		
	}

	@Override
	public void deleteQQ(Long id) throws Exception {
		// TODO Auto-generated method stub
		QQ qq = qqMapper.findQQById(id);
		if(qq!=null) {
			qqMapper.deleteQQ(id);
		}
		else {
			throw new Exception("此id不存在");
		}
		
	}

	

	

}
