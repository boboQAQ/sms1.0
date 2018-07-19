package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Grade;
import com.briup.app02.service.IGradeService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;
@Api(description="年级相关接口")
@RestController
@RequestMapping("/grade")
public class GradeController {
	@Autowired
	private IGradeService gradeService;
	@GetMapping("findGradeAll")
	public MsgResponse findGradeAll() {
		try {
			List<Grade> list = gradeService.findGradeAll();
			return MsgResponse.success("查询成功",list );
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findGradeById")
	public MsgResponse findGradeById(Long id) {
		try {
			Grade grade = gradeService.findGradeById(id);
			return MsgResponse.success("查询成功", grade);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updateGrade")
	public MsgResponse updateGrade(Grade grade) {
		try {
			gradeService.updateGrade(grade);
			return MsgResponse.success("更新成功", grade);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveGrade")
	public MsgResponse saveGrade(Grade grade) {
		try {
			gradeService.saveGrade(grade);
			return MsgResponse.success("保存成功", grade);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("deleteGrade")
	public MsgResponse deleteGrade(Long id) {
		try {
			gradeService.deleteGrade(id);
			return MsgResponse.success("删除成功", null);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
