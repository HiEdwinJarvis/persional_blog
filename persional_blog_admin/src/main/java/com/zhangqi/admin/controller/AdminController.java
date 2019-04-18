package com.zhangqi.admin.controller;
import com.zhangqi.admin.services.AdminService;
import com.zhangqi.domain.po.PbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller()
@RequestMapping("admin")
public class AdminController {
  @Autowired
  private AdminService ads;
  /*
  * 管理员后台登录登录
  * */
  @RequestMapping(value = {"", "login"}, method = RequestMethod.GET)
  public String login() {
      return "login";
  }
    @RequestMapping("/login.do")
    public String login(String email, String password, Model model){
        String md5 = DigestUtils.md5DigestAsHex(password.getBytes());
        System.out.println(md5);
        PbUser user =ads.login(email,password);
        if(user==null){
            model.addAttribute("message","用户名密码错误");
            System.out.println("失败");
            return "login";
        }else{
            System.out.println("登录成功");
            return "redirect:/main.do";
        }
    }
    /*
    *
    * */
}
