package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Clazz;
import com.briup.app02.service.IClazzService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/clazz")
public class ClazzController {
	@Autowired
	private IClazzService clazzService;
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
