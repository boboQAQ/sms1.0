package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Option;
import com.briup.app02.service.IOptionService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/option")
public class OptionController {
	@Autowired
	private IOptionService optionService;
	@GetMapping("findOptionAll")
	public MsgResponse findOptionAll() {
		try {
			List<Option> list = optionService.findOptionAll();
			return MsgResponse.success("查询成功",list );
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findOptionById")
	public MsgResponse findOptionById(Long id) {
		try {
			Option option = optionService.findOptionById(id);
			return MsgResponse.success("查询成功", option);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updateOption")
	public MsgResponse updateOption(Option option) {
		try {
			optionService.updateOption(option);
			return MsgResponse.success("更新成功", option);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveOption")
	public MsgResponse saveOption(Option option) {
		try {
			optionService.saveOption(option);
			return MsgResponse.success("保存成功", option);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("deleteOption")
	public MsgResponse deleteOption(Long id) {
		try {
			optionService.deleteOption(id);
			return MsgResponse.success("删除成功", null);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}


}
