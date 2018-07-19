package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Question;
import com.briup.app02.bean.vm.QuestionVM;
import com.briup.app02.service.IQuestionService;
import com.briup.app02.util.MsgResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
@Api(description="问题相关接口")
@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	private IQuestionService questionService;
	@ApiOperation(value="保存问题"
			,notes="保存问题同事保存选项，不必保存id，选项中question_id的外键就是question的id")
	@PostMapping("save_Question")
	public MsgResponse save_Question(QuestionVM questionVM) {
		try {
			questionService.save_Question(questionVM);
			return MsgResponse.success("保存成功", null);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}

	}
	
	
	@ApiOperation(value="查询所有问题"
			,notes="查询出所具有的选项")
	@GetMapping("findAllQuestionVM")
	public MsgResponse findAllQuestionVM() {
		try {
			List<QuestionVM> list = questionService.findAllQuestionVM();
			return MsgResponse.success("查询成功",list );
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	
	
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
	@ApiOperation(value="查询一个问题"
			,notes="查询出问题有的选项")
	@GetMapping("findQuestionByIdVM")
	public MsgResponse findQuestionByIdVM(Long id) {
		try {
			QuestionVM question = questionService.findQuestionByIdVM(id);
			return MsgResponse.success("查询成功", question);
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
