package com.zhangqi.api.web.controller.v1;

import com.zhangqi.api.services.PbInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="${api.path.v1}/test")
public class PbInfoController {
    @Autowired
    PbInfoService pbInfoService;
    @RequestMapping("go.do")
    public String dd(){

        System.out.println("======================");
        return "ddd";
    }
}
