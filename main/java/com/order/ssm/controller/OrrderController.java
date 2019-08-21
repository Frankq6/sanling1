package com.order.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.order.ssm.bean.Msg;
import com.order.ssm.bean.Orrder;
import com.order.ssm.service.OrrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrrderController {

    @Autowired
    OrrderService orrderService;

    @ResponseBody
    @RequestMapping(value = "/orrder/{oid}", method = RequestMethod.DELETE)
    public Msg deleteOrrderById(@PathVariable("oid") Integer id){
        orrderService.deleteOrrder(id);
        return Msg.sucess();
    }

    @RequestMapping(value = "/orrder/{oid}", method = RequestMethod.PUT)
    @ResponseBody
    public Msg saveOrrder(Orrder orrder){
        orrderService.updateOrrder(orrder);
        return Msg.sucess();
    }



    @RequestMapping("/orrder")
    @ResponseBody
    public Msg getOrderWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn){
        PageHelper.startPage(pn, 8);
        List<Orrder> orrders = orrderService.getAll();
        PageInfo page = new PageInfo(orrders,8);
        return Msg.sucess().add("pageInfo", page);
    }

//    @RequestMapping("/orrder")
//    public String getOrrder(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model){
//
//        PageHelper.startPage(pn, 8);
//        List<Orrder> orrders = orrderService.getAll();
//        PageInfo page = new PageInfo(orrders,8);
//        model.addAttribute("pageInfo",page);
//        System.out.println("跳转成功！");
//        return "list";
//    }

    @RequestMapping(value = "/orrder/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Msg getorrder(@PathVariable("id")Integer id){

        Orrder orrder = orrderService.getOrrder(id);
        return Msg.sucess().add("odr", orrder);

    }
}
