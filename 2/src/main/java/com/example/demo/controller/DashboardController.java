package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @project: demo
 * @packageName: com.example.demo.controller
 * @author: Administrator
 * @date: 2020/5/13 20:02
 * @description：TODO
 */
@RequestMapping(value = "/")
@Controller
public class DashboardController {
	@GetMapping
	@ResponseBody
	public String index() {
		return "index";
	}
}
