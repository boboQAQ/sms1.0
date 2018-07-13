package com.briup.app02.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
 * 路由的命名空间
 * http:
 * */

@RestController
@RequestMapping("/test")
public class TestController {
	@GetMapping("hello")
	public String hello() {
		return "Hello,World";
	}
	@GetMapping("world")
	public String world() {
		return "Hello,World,你好世界";
	}

}
