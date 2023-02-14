package com.xszx.controller;

import com.xszx.beans.Ba;
import com.xszx.service.BaService;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author Learning makes me happy.
 * @date 2023/2/12 22:55
 */
@Controller
public class BaController {
    @Resource
    private BaService baService;

    public void setBaService(BaService baService) {
        this.baService = baService;
    }

    //票吧信息
    @RequestMapping("/getTicket")
    @ResponseBody
    public List<Ba> getTicket(String type){
        List<Ba> tickets = baService.getBaByType(type);
        return tickets;
    }

    //票吧详细信息
    @RequestMapping("/ticket")
    public String getTicketByBid(int bid, Model model){
        Ba ticket = baService.getBaByBid(bid);
        model.addAttribute("ticket",ticket);
        return "jsp/ticket";
    }

    //根据价格排序
    @RequestMapping("/getTicketOrderPrice")
    @ResponseBody
    public List<Ba> getTicketOrderPrice(String type){
        List<Ba> tickets = baService.getBaOrderPrice(type);
        return tickets;
    }
    //分类查看
    @RequestMapping("/getTicketByST")
    @ResponseBody
    public List<Ba> getTicketByST(String type,String st){
        List<Ba> tickets = baService.getTicketByST(type,st);
        return tickets;
    }

    //获得相关商品
    @RequestMapping("/getBaByUid")
    @ResponseBody
    public List<Ba> getBaByUid(int u_id){
        u_id=1;
        List<Ba> bas=baService.getBaByUid(u_id);
        return bas;
    }


    //住吧信息
    @RequestMapping("/getHotel")
    @ResponseBody
    public List<Ba> getHotel(String type){
        List<Ba> hotels = baService.getBaByType(type);
        return hotels;
    }

    @RequestMapping("/addBa")
    public String addBa(Ba ba){
        baService.addBa(ba);
        return "0";
    }

    //添加图片
    @RequestMapping(value = "/addImage",produces = "text/json;charset=utf-8")
    @ResponseBody
    public String addImage(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {
        String realPath = request.getSession().getServletContext().getRealPath("/static/image/");
        String originalFilename = file.getOriginalFilename();
        FileUtils.copyInputStreamToFile(file.getInputStream(),new File(realPath,file.getOriginalFilename()));

        return "/static/image/"+originalFilename;
    }


}
