package com.xszx.controller;

import com.xszx.beans.Shopping;
import com.xszx.beans.User;
import com.xszx.service.ShoppingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

//购物车
@Controller
public class ShoppingController {
    @Resource
    private ShoppingService shoppingService;

    public void setShoppingService(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }




    @RequestMapping("/getshopping")
    @ResponseBody
    public List<Shopping> getshopping(){
       List<Shopping> list = shoppingService.getshopping();
        System.out.println(list);
        return list;
    }



    @RequestMapping("/updateSid2")
    @ResponseBody
    public String updateSid2(int s_id){
        shoppingService.updatesid2(s_id);
        return "1";
    }


    @RequestMapping("/updateSid1")
    @ResponseBody
    public String updateSid1(int s_id ){
       Shopping shopping= shoppingService.getshoppingamount(s_id);
       if (shopping.getS_amount()>1){
           shoppingService.updateSid1(s_id);
           return "0";
       }
        return "1";
    }


    @RequestMapping("/getprice")
    public void getprice(int s_id){
        System.out.println(s_id+"789456");
    }



    @RequestMapping("/addShopping")
    public String addShopping(int bid,Model model){
        User loginUser = (User) model.getAttribute("loginUser");
        int u_id = loginUser.getU_id();
        shoppingService.addShopping(u_id,bid);
        return "redirect:/jsp/shopping.jsp";
    }
}
