package com.order.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.order.ssm.bean.Prstate;
import com.order.ssm.service.PrstateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PrstateController {
    @Autowired
    PrstateService prstateService;

    @RequestMapping("/prstate")
    public String getPrstate(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model){

        PageHelper.startPage(pn, 8);
        List<Prstate> prstate = prstateService.getAll();
        PageInfo page = new PageInfo(prstate,8);
        model.addAttribute("pageInfo",page);
        System.out.println("跳转成功！");
        return "list2";
    }
}
