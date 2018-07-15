package com.briup.app02.dao;

import java.util.List;

import com.briup.app02.bean.Answer;


public interface AnswerMapper {
	/**
	 * @ 查询所有学生信息
	 * @return
	 * @author 波波
	 */
	List<Answer> findAnswerAll();
	/**
	 * @按id查询学生信息
	 * @return
	 * @author 波波
	 */
	Answer findAnswerById(Long id);
	/**
	 * @插入学生信息
	 * @return
	 * @author 波波
	 */
	void insertAnswer(Answer answer);
	/**
	 * @更新学生信息
	 * @return
	 * @author 波波
	 */
	void updateAnswer (Answer answer);
	/**
	 * @删除学生信息
	 * @return
	 * @author 波波
	 */
	void deleteAnswer (long id);
}
