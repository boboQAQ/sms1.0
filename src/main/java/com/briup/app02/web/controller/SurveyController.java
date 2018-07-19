package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Survey;
import com.briup.app02.bean.vm.SurveyVM;
import com.briup.app02.service.ISurveyService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(description="调查相关接口")
@RestController
@RequestMapping("/survey")
public class SurveyController {
	@Autowired
	private ISurveyService surveyService;
	@ApiOperation(value="查询所有调查"
			,notes="只能查询出调查信息，并且级联查询到与调查有关的信息")
	@GetMapping("findAllSurveyVM")
	public MsgResponse findAllSurveyVM() {
		try {
			List<SurveyVM> list = surveyService.findAllSurveyVM();
			return MsgResponse.success("查询成功",list );
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@GetMapping("findSurveyAll")
	public MsgResponse findSurveyAll() {
		try {
			List<Survey> list = surveyService.findSurveyAll();
			return MsgResponse.success("查询成功",list );
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@ApiOperation(value="查询某个调查"
			,notes="只能查询出调查信息，并且级联查询到与调查有关的信息")
	@GetMapping("findSurveyByIdVM")
	public MsgResponse findSurveyByIdVM(Long id) {
		try {
			SurveyVM survey = surveyService.findSurveyByIdVM(id);
			return MsgResponse.success("查询成功", survey);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	@GetMapping("findSurveyById")
	public MsgResponse findSurveyById(Long id) {
		try {
			Survey survey = surveyService.findSurveyById(id);
			return MsgResponse.success("查询成功", survey);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updateSurvey")
	public MsgResponse updateSurvey(Survey survey) {
		try {
			surveyService.updateSurvey(survey);
			return MsgResponse.success("更新成功", survey);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveSurvey")
	public MsgResponse saveSurvey(Survey survey) {
		try {
			surveyService.saveSurvey(survey);
			return MsgResponse.success("保存成功", survey);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("deleteSurvey")
	public MsgResponse deleteSurvey(Long id) {
		try {
			surveyService.deleteSurvey(id);
			return MsgResponse.success("删除成功", null);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}


}
