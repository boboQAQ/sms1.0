package com.briup.app02.dao.extend;

import java.util.List;

import com.briup.app02.bean.vm.ClazzVM;

public interface ClazzVMMapper {
	List<ClazzVM> findAllClazzVM();
	ClazzVM findClazzByIdVM(Long id);
}
