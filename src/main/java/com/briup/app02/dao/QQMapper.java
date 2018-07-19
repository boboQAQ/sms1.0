package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.QQ;




public interface QQMapper {
	List<QQ> findQQAll();
	QQ findQQById(Long id);
	Long findByQuestionnaireId(Long id);
	void updateQQ(QQ qq);
	void saveQQ(QQ qq);
	void deleteQQ(Long id);
}
