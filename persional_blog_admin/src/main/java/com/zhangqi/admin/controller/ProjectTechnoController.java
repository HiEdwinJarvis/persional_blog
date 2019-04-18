package com.zhangqi.admin.controller;

import com.zhangqi.admin.services.ProjectTechService;
import com.zhangqi.commons.util.JSONArray;
import com.zhangqi.domain.po.PbProjectTechno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("ProjectTech")
public class ProjectTechnoController {
    @Autowired
    ProjectTechService projectTechService;
    @ResponseBody
    @RequestMapping(value = "techlist.do",method = RequestMethod.GET)
    public String techlist(){
        System.out.println("=========ajax");
        ArrayList<PbProjectTechno> pbprotelist = projectTechService.selectAll();
        JSONArray jsonArray = new JSONArray();
        System.out.println(jsonArray.listToJson(pbprotelist));
        return jsonArray.listToJson(pbprotelist);
    }
}
