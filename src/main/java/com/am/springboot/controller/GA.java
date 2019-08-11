package com.am.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/goods")
public class GA {


    @RequestMapping("")
    public String homePage() {
        //model.addAttribute("user","1234");
        return "goods/goodshome";
    }

}
