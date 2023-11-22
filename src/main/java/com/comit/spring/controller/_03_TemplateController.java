package com.comit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class _03_TemplateController {

	@GetMapping("/parameters")
	String Welcome() {
		System.out.println("test its working :)");
		return "welcome";
	}
}
