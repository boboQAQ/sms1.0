package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.School;
import com.briup.app02.service.ISchoolService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/school")
public class SchoolController {
	@Autowired
	private ISchoolService schoolService;
	@GetMapping("findSchoolAll")
	public MsgResponse findSchoolAll() {
		try {
			List<School> list = schoolService.findSchoolAll();
			return MsgResponse.success("查询成功",list );
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findSchoolById")
	public MsgResponse findSchoolById(Long id) {
		try {
			School school = schoolService.findSchoolById(id);
			return MsgResponse.success("查询成功", school);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updateSchool")
	public MsgResponse updateSchool(School school) {
		try {
			schoolService.updateSchool(school);
			return MsgResponse.success("更新成功", school);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveSchool")
	public MsgResponse saveSchool(School school) {
		try {
			schoolService.saveSchool(school);
			return MsgResponse.success("保存成功", school);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("deleteSchool")
	public MsgResponse deleteSchool(Long id) {
		try {
			schoolService.deleteSchool(id);
			return MsgResponse.success("删除成功", null);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}

}
