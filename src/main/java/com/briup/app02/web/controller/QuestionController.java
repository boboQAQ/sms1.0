package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Question;
import com.briup.app02.service.IQuestionService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private IQuestionService questionService;
	@GetMapping("findQuestionAll")
	public MsgResponse findQuestionAll() {
		try {
			List<Question> list = questionService.findQuestionAll();
			return MsgResponse.success("查询成功",list );
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findQuestionById")
	public MsgResponse findQuestionById(Long id) {
		try {
			Question question = questionService.findQuestionById(id);
			return MsgResponse.success("查询成功", question);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updateQuestion")
	public MsgResponse updateQuestion(Question question) {
		try {
			questionService.updateQuestion(question);
			return MsgResponse.success("更新成功", question);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveQuestion")
	public MsgResponse saveQuestion(Question question) {
		try {
			questionService.saveQuestion(question);
			return MsgResponse.success("保存成功", question);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("deleteQuestion")
	public MsgResponse deleteQuestion(Long id) {
		try {
			questionService.deleteQuestion(id);
			return MsgResponse.success("删除成功", null);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}


}
