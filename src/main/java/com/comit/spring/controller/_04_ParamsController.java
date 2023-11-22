package com.comit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class _04_ParamsController {

	@GetMapping("/parameters")
	ModelAndView hello(@RequestParam String first, @RequestParam String second) {
		System.out.println("First parameter: " + first);
		System.out.println("Second parameter: " + second);
		
		ModelAndView mv = new ModelAndView("parameters"); //HTML Template Name
		mv.addObject("first", first);
		mv.addObject("second", second);
		
		return mv;
	}
}
