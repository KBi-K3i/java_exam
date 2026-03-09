package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.MemberService;



@Controller
@RequestMapping("/")
public class MemberController {
    
    @Autowired
    MemberService service;

    @RequestMapping("/member")
    public String index(Model model) {

        model.addAttribute("member", service.getAllData());

        return "ex-thymeleaf-input";
    }
    

}
