package com.am.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usermanage")
public class TK {


    //@RequestMapping("/userpage")
    @RequestMapping("")
    public String usermanage() {
        return "usermanage/manage";
    }


}
