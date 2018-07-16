package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Questionnaire;
import com.briup.app02.service.IQuestionnaireService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/questionnaire")
public class QuestionnaireController {
	@Autowired
	private IQuestionnaireService questionnaireService;
	@GetMapping("findQuestionnaireAll")
	public MsgResponse findQuestionnaireAll() {
		try {
			List<Questionnaire> list = questionnaireService.findQuestionnaireAll();
			return MsgResponse.success("查询成功",list );
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findQuestionnaireById")
	public MsgResponse findQuestionnaireById(Long id) {
		try {
			Questionnaire questionnaire = questionnaireService.findQuestionnaireById(id);
			return MsgResponse.success("查询成功", questionnaire);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updateQuestionnaire")
	public MsgResponse updateQuestionnaire(Questionnaire questionnaire) {
		try {
			questionnaireService.updateQuestionnaire(questionnaire);
			return MsgResponse.success("更新成功", questionnaire);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveQuestionnaire")
	public MsgResponse saveQuestionnaire(Questionnaire questionnaire) {
		try {
			questionnaireService.saveQuestionnaire(questionnaire);
			return MsgResponse.success("保存成功", questionnaire);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("deleteQuestionnaire")
	public MsgResponse deleteQuestionnaire(Long id) {
		try {
			questionnaireService.deleteQuestionnaire(id);
			return MsgResponse.success("删除成功", null);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}


}
