package com.zhangqi.admin.controller;

import com.zhangqi.admin.services.BlogService;
import com.zhangqi.commons.dto.BaseResult;
import com.zhangqi.commons.util.JSONArray;
import com.zhangqi.domain.po.PbCategory;
import com.zhangqi.domain.po.PbInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;


@Controller
@RequestMapping("blog")
public class BlogController {
@Autowired
BlogService blogService;

@RequestMapping("golist.do")
public String golist(){
    return "bloglist";
}
@ResponseBody
 @RequestMapping(value="list.do",method= RequestMethod.GET)
    public String blogList(){
     System.out.println("controller");
    ArrayList<PbInfo> bloglist = blogService.ALLBlog();

     return JSONArray.listToJson(bloglist);
 }
 @RequestMapping("form.do")
    public String form(Model model){
     //ArrayList<Pbcategory> categoryList = blogService.selectAllCategory();
     //model.addAttribute("categoryList",categoryList);
     return "blog_form";
 }
 @RequestMapping("delete.do")
    public String delete(String key){
     System.out.println(key);
     Integer key1 = Integer.valueOf(key);
     System.out.println(key);
     System.out.println(66666);
     blogService.deleteBlog(key1);
     return "blog_form";
 }
 @RequestMapping("add.do")
    public String add(@ModelAttribute PbInfo pbInfo, String pbCategorynum, Model model, RedirectAttributes redirectAttributes){
     Integer categourId = Integer.valueOf(pbCategorynum);
     pbInfo.setPbCategoryid(categourId);
     System.out.println(pbInfo.getPbCategoryid());
     System.out.println(pbInfo.getPbInfotitle());
     System.out.println(pbInfo.getPbInfobody());
     BaseResult baseResult = blogService.save(pbInfo);
     if (baseResult.getStatus() == 200) {
         redirectAttributes.addFlashAttribute("baseResult", baseResult);
         return "redirect:/blog/bloglist";
     }

     // 保存失败
     else {
         model.addAttribute("baseResult", baseResult);
         return "blog_form";
     }

 }
 @RequestMapping("form2.do")
 public String form2(Integer pbInfo,Model model){

  model.addAttribute("pbInfo",pbInfo);

  return "blog_form2";
 }
 @RequestMapping("find.do")
    public String find(String pbInfokey,Model model){
     Integer pbk = Integer.valueOf(pbInfokey);
     System.out.println(pbk+"*****");
  System.out.println(pbInfokey+" ==========<");
     PbInfo pbInfo = blogService.selectBykey(pbk);
     ArrayList<PbCategory> categoryList = blogService.selectAllCategory();
     model.addAttribute("categoryList",categoryList);
     model.addAttribute("pbInfot",pbInfo);
     System.out.println("hello ck");
     System.out.println(pbInfo.getPbInfotitle());
     System.out.println(pbInfo.getPbInfobody());
     return "blog_form2";
 }
 @RequestMapping("update.do")
    public String update(@ModelAttribute PbInfo pbInfo,String pbCategorynum,Model model){
     Integer categourId = Integer.valueOf(pbCategorynum);
     pbInfo.setPbCategoryid(categourId);

     int flag = blogService.update(pbInfo);
     if(flag==200){
         return "bloglist";
     }else{
         model.addAttribute("message","更新失败");
     }
     return "bloglist";
 }
}
