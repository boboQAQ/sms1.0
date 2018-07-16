package com.briup.app02.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.app02.bean.Answer;
import com.briup.app02.service.IAnswerService;
import com.briup.app02.util.MsgResponse;

@RestController
@RequestMapping("/answer")
public class AnswerController {
	@Autowired
	private IAnswerService answerService;
	@GetMapping("findAnswerAll")
	public MsgResponse findAnswerAll() {
		try {
			List<Answer> list = answerService.findAnswerAll();
			return MsgResponse.success("查询成功",list );
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@GetMapping("findAnswerById")
	public MsgResponse findAnswerById(Long id) {
		try {
			Answer answer = answerService.findAnswerById(id);
			return MsgResponse.success("查询成功", answer);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@PostMapping("updateAnswer")
	public MsgResponse updateAnswer(Answer answer) {
		try {
			answerService.updateAnswer(answer);
			return MsgResponse.success("更新成功", answer);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	
	@PostMapping("saveAnswer")
	public MsgResponse saveAnswer(Answer answer) {
		try {
			answerService.saveAnswer(answer);
			return MsgResponse.success("保存成功", answer);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}
	@GetMapping("deleteAnswer")
	public MsgResponse deleteAnswer(Long id) {
		try {
			answerService.deleteAnswer(id);
			return MsgResponse.success("删除成功", null);
		}catch(Exception e) {
			e.printStackTrace();
			return MsgResponse.error(e.getMessage());
		}
	}


}
