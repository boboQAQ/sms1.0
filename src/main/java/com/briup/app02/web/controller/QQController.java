package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.QQ;
import com.briup.app02.service.IQQService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/qq")
public class QQController {
	@Autowired
	private IQQService qqService;
	@GetMapping("findQQAll")
	public MsgResponse findQQAll() {
		try {
			List<QQ> list = qqService.findQQAll();
			return MsgResponse.success("查询成功",list );
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findQQById")
	public MsgResponse findQQById(Long id) {
		try {
			QQ qq = qqService.findQQById(id);
			return MsgResponse.success("查询成功", qq);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updateQQ")
	public MsgResponse updateQQ(QQ qq) {
		try {
			qqService.updateQQ(qq);
			return MsgResponse.success("更新成功", qq);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveQQ")
	public MsgResponse saveQQ(QQ qq) {
		try {
			qqService.saveQQ(qq);
			return MsgResponse.success("保存成功", qq);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("deleteQQ")
	public MsgResponse deleteQQ(Long id) {
		try {
			qqService.deleteQQ(id);
			return MsgResponse.success("删除成功", null);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}


}
