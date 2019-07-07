package com.statement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.statement.service.TestService;

@Controller
public class StatementController {
	@Autowired
	private TestService testService;

	public void test() {
		testService.test();
	}
}
