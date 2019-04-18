package com.zhangqi.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
    @RequestMapping("main.do")
    public String main(){
        return "main";
    }
}
