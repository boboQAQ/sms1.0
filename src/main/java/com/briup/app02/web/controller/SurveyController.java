package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Survey;
import com.briup.app02.service.ISurveyService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/survey")
public class SurveyController {
	@Autowired
	private ISurveyService surveyService;
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
