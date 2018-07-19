package com.briup.app02.service;

import java.util.List;

import com.briup.app02.bean.QQ;


public interface IQQService {
	
	List<QQ> findQQAll()throws Exception;

	QQ findQQById(Long id)throws Exception;
	void updateQQ(QQ qq)throws Exception;
	void saveQQ(QQ qq)throws Exception;
	void deleteQQ(Long id)throws Exception;
}
