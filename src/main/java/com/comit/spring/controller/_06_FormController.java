package com.comit.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.comit.spring.bean.User;

@Controller
public class _06_FormController {

    @GetMapping("/form")
    String show(User user) {
        System.out.println("Showing Form");

        return "user_form";
    }


    @PostMapping("/form")
    ModelAndView process(User user) {

        System.out.println("User: " + user);

        return new ModelAndView("user_table","user",user);
    }
}