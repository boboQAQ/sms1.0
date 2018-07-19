package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Clazz;
import com.briup.app02.bean.vm.ClazzVM;
import com.briup.app02.service.IClazzService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(description="班级相关接口")
@RestController
@RequestMapping("/clazz")
public class ClazzController {
	@Autowired
	private IClazzService clazzService;
	
	
	@ApiOperation(value="查询所有班级"
			,notes="只能查询出班级信息，并且级联查询到年级和班主任")
	@GetMapping("findAllClazzVM")
	public MsgResponse findAllClazzVM() {
		try {
			List<ClazzVM> list = clazzService.findAllClazzVM();
			return MsgResponse.success("查询成功",list );
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@ApiOperation(value="查询所有班级"
			,notes="只能查询出班级的基本信息，无法级联查询到年级和班主任")
	@GetMapping("findClazzAll")
	public MsgResponse findClazzAll() {
		try {
			List<Clazz> list = clazzService.findClazzAll();
			return MsgResponse.success("查询成功",list );
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@ApiOperation(value="查询一个班级"
			,notes="只能查询出班级信息，并且级联查询到年级和班主任")
	@GetMapping("findClazzByIdVM")
	public MsgResponse findClazzByIdVM(Long id) {
		try {
			ClazzVM clazz = clazzService.findClazzByIdVM(id);
			return MsgResponse.success("查询成功", clazz);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@ApiOperation(value="查询一个班级"
			,notes="只能查询出班级的基本信息，无法级联查询到年级和班主任")
	@GetMapping("findClazzById")
	public MsgResponse findClazzById(Long id) {
		try {
			Clazz clazz = clazzService.findClazzById(id);
			return MsgResponse.success("查询成功", clazz);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updateClazz")
	public MsgResponse updateClazz(Clazz clazz) {
		try {
			clazzService.updateClazz(clazz);
			return MsgResponse.success("更新成功", clazz);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveClazz")
	public MsgResponse saveClazz(Clazz clazz) {
		try {
			clazzService.saveClazz(clazz);
			return MsgResponse.success("保存成功", clazz);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("deleteClazz")
	public MsgResponse deleteClazz(Long id) {
		try {
			clazzService.deleteClazz(id);
			return MsgResponse.success("删除成功", null);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}


}
