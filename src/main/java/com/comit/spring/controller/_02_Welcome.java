package com.comit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class _02_Welcome {

	@GetMapping("/welcome")
	@ResponseBody String welcome() {
		return "<html>"
				+ "<body>"
				+ "<h1>Hello World</h1>"
				+ "<a href='http://www.google.com>Google</a>"
				+ "</body>"
				+ "</html>";
	}
	
}
