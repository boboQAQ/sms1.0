package com.briup.app02.dao;

import java.util.List;
import com.briup.app02.bean.Student;

public interface StudentMapper {
	/**
	 * @ 查询所有学生信息
	 * @return
	 * @author 波波
	 */
	List<Student> findAll();
	/**
	 * @按id查询学生信息
	 * @return
	 * @author 波波
	 */
	Student findById(long id);
	/**
	 * @插入学生信息
	 * @return
	 * @author 波波
	 */
	void insert(Student student);
	/**
	 * @更新学生信息
	 * @return
	 * @author 波波
	 */
	void update (Student student);
	/**
	 * @删除学生信息
	 * @return
	 * @author 波波
	 */
	void delete (long id);
}
