package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Option;
import com.briup.app02.bean.vm.OptionVM;
import com.briup.app02.service.IOptionService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(description="选项相关接口")
@RestController
@RequestMapping("/option")
public class OptionController {
	@Autowired
	private IOptionService optionService;
	
	@ApiOperation(value="查询所有选项"
			,notes="只能查询出选项信息，并且级联查询到选项对应的问题")
	@GetMapping("findAllOptionVM")
	public MsgResponse findAllOptionVM() {
		try {
			List<OptionVM> list = optionService.findAllOptionVM();
			return MsgResponse.success("查询成功",list );
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
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
	@ApiOperation(value="查询某个选项"
			,notes="只能查询出选项信息，并且级联查询到选项对应的问题")
	@GetMapping("findOptionByIdVM")
	public MsgResponse findOptionByIdVM(Long id) {
		try {
			OptionVM option = optionService.findOptionByIdVM(id);
			return MsgResponse.success("查询成功", option);
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
