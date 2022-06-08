package com.enmusushi.studyseesion.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView("index.html");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
