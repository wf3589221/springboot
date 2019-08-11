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


    @RequestMapping("/userinfo")
    public String userinfo() {
        return "usermanage/userinfo";
    }

    @RequestMapping("/validate")
    public String validate() {
        return "usermanage/validate";
    }

    @RequestMapping("/passmodify")
    public String passmodify() {
        return "usermanage/passmodify";
    }

}
