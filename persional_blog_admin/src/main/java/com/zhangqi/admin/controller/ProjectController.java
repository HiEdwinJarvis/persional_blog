package com.zhangqi.admin.controller;

import com.zhangqi.admin.services.ProjectService;
import com.zhangqi.domain.po.PbProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("project")
public class ProjectController {
    @Autowired
    ProjectService projectService;
    @RequestMapping("projectList.do")
    public String projectList(Model model){
        ArrayList<PbProject> pbprojectlist = projectService.AllProject();
        model.addAttribute("pbprojectlist",pbprojectlist);
        return "project_list";
    }

    @RequestMapping("projectForm.do")
    public String projectForm(){
        return "project_form";
    }

    
}
