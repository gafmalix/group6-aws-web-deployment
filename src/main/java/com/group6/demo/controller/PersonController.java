package com.group6.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@RequestMapping("/greetGroupName")
	public String greetGroupName() {
		return "Hello Group 6 Members";
	}
}
