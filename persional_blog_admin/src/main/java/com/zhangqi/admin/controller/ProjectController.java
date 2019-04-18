package com.zhangqi.admin.controller;

import com.zhangqi.admin.services.ProjectService;
import com.zhangqi.admin.services.ProjectTechService;
import com.zhangqi.commons.dto.BaseResult;
import com.zhangqi.commons.util.JSONArray;
import com.zhangqi.domain.po.PbProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping("project")
public class ProjectController {
    @Autowired
    ProjectService projectService;
    @Autowired
    ProjectTechService projectTechService;
    /*
    * 跳转到项目列表页
    * */
    @RequestMapping("goprojectList.do")
    public String goprojectList(){

        return "project_list";
    }

    @ResponseBody
    @RequestMapping("selectPJlist.do")
    public String selectPjlist(){
        ArrayList<PbProject> pbprojectlist = projectService.AllProject();
        return JSONArray.listToJson(pbprojectlist);
    }


    @RequestMapping("projectForm.do")
    public String projectForm(){
        return "project_form";
    }

    @RequestMapping("add.do")
    public String addproject(PbProject pbProject, Integer[] arr, RedirectAttributes redirectAttributes, Model model){
        System.out.println(Arrays.toString(arr));
        System.out.println("===="+pbProject.getPbProjectname());
        System.out.println("===="+pbProject.getPbProjectpric());
        System.out.println("===="+pbProject.getPbProjectdesc());
        System.out.println("===="+pbProject.getPbProjectname());
        pbProject.setPbOnecategoryid(2);
        BaseResult baseResult = projectService.save(pbProject);
        if (baseResult.getStatus() == 200) {
            redirectAttributes.addFlashAttribute("baseResult", baseResult);

            /*
            * 个项目技术表添加技术
            * */

            return "redirect:/project/goprojectList.do";
        }

        // 保存失败
        else {
            model.addAttribute("baseResult", baseResult);
            return "project_list";
        }

    }

    
}
