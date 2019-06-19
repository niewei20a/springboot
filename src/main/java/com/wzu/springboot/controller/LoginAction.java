package com.wzu.springboot.controller;

import com.wzu.springboot.code.Globle;
import com.wzu.springboot.pojo.User;
import com.wzu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginAction {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String loginIndex(){
        return "login";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @PostMapping("/loginCheck")
    public String loginCheck(User user, HttpSession session, ModelMap modelMap){
        System.out.println("name = " + user.toString());
        String co = Globle.getCode();
        System.out.println("co = " + co);
        String code = user.getName();
        if(co!=null&&co.equalsIgnoreCase(code)){
            System.out.println("验证码正确");
            if(userService.checkUser(user)){
                System.out.println("登陆成功！");
            }else {
                modelMap.addAttribute("errMsg","用户名或密码错误");
            }
        }else {
            modelMap.addAttribute("errMsg","验证码错误");
        }
        return "login";
    }
    @PostMapping("/registerUser")
    public String registerUser(User user, HttpSession session, ModelMap modelMap){
        String co = Globle.getCode();
        String code = user.getName();
        System.out.println(user.toString());
        if(co!=null&&co.equalsIgnoreCase(code)){
            System.out.println("验证码正确");
            if(user.getPassword()!=""){
                String message = userService.registerUser(user);
                System.out.println("message = " +message);
                if(message.equals("注册成功")){
                    return "redirect:login";
                }else {
                    modelMap.addAttribute("errMsg",message);
                }
            }
        }else {
            modelMap.addAttribute("errMsg","验证码错误");
        }
        return "register";
    }

}
