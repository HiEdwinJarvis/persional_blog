package com.zhangqi.ui.controller;


import com.zhangqi.commons.util.HttpClientUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    /**
     * 跳转首页
     *
     * @return
     */
    @RequestMapping(value = {"index.do", "index"}, method = RequestMethod.GET)
    public String index(Model model) {
        // 请求幻灯片
        String result = HttpClientUtils.doGet("http://localhost:8081/persional_blog_api_war_exploded/api/v1/test/go.do");

        System.out.println(result);
        return "index";
    }
}
