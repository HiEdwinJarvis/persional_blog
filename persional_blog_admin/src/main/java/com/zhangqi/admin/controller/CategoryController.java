package com.zhangqi.admin.controller;

import com.zhangqi.admin.services.CategoryService;
import com.zhangqi.commons.util.JSONArray;
import com.zhangqi.domain.po.PbCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "selectAll.do" ,method = RequestMethod.POST)
    public String selectAll(Model model){
        System.out.println("hhhh");
        ArrayList<PbCategory> categoryList =  categoryService.selectAll();
        model.addAttribute("categoryList",categoryList);
        return "111000";
    }
    @ResponseBody
    @RequestMapping(value="queryCouponState.do",produces = "text/html;charset=utf-8",method = RequestMethod.GET)
    public String queryCoupon(
            Model model) throws Exception{
        System.out.println("==============");
        //根据状态查询出来的List数据
        ArrayList<PbCategory> categoryList =  categoryService.selectAll();

        System.out.println("条数"+categoryList.size());
        //System.err.println("状态"+state);
        model.addAttribute("categoryList",categoryList);

        JSONArray jsonArray = new JSONArray();


        return jsonArray.listToJson(categoryList);
    }
    @ResponseBody
    @RequestMapping(value = "dd.do",method = RequestMethod.GET)
    public String dd(){
        System.out.println("success");
        return "dd";
    }

}
