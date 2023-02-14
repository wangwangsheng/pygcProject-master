package com.xszx.controller;

import com.xszx.beans.User;
import com.xszx.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;

/**
 * @author Learning makes me happy.
 * @date 2023/2/9 10:36
 */
@Controller
@SessionAttributes("loginUser")
public class UserController {

    @Resource
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("/login") //此注解定义视图进入控制器的Url
    @ResponseBody    //此注解将返回的字符串写入响应对象体中
    public String login(Model model,String phone,String password){
        if (phone==null){
            return "phonenull";
        }
        String md5encryption = DigestUtils.md5DigestAsHex(password.getBytes());
        password = md5encryption;
        User user=userService.login(phone,password);
        System.out.println(user);
        if (user==null){
            return "false";
        }
        model.addAttribute("loginUser",user);
        return "true";

    }

    @RequestMapping("/register")
    @ResponseBody
    public String register(String phone,String password){
        //假设先不看手机号的短信验证码 先看看手机号是否存在
        User user =userService.checkPhone(phone);
        if (user==null){
            //说明这个手机号不存在 可以注册
            //这时需要判断密码的长度 长度在6-20位
            if (password.length()<=20 && password.length()>=6){
                //用md5实现密码加密
                String md5encryption = DigestUtils.md5DigestAsHex(password.getBytes());
                password = md5encryption;
                userService.addUser(phone,password);
                return "true";
            }else {
                //密码长度不符合
                return "not";
            }
        }
        //手机号已经存在 不可以注册
        return "false";
    }

    public String updatePassword(String phone,String newPassword){
        // 重置密码要先看看手机号是否存在
        User user =userService.checkPhone(phone);
        if (user==null){
            //说明手机号不存在 不可以重置密码
            return "false";
        }
        String md5encryption = DigestUtils.md5DigestAsHex(newPassword.getBytes());
        newPassword = md5encryption;
        userService.updatePassword(phone,newPassword);
        return "true";
    }




}
