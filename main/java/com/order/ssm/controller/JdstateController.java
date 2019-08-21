package com.order.ssm.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.order.ssm.bean.Jdstate;
import com.order.ssm.service.JdstateService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class JdstateController {
    @Autowired
    JdstateService jdstateService;

    @RequestMapping("/jdstate")
    public String getJdstate(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model){

        PageHelper.startPage(pn, 8);
        List<Jdstate> jdstate = jdstateService.getAll();
        PageInfo page = new PageInfo(jdstate,8);
        model.addAttribute("pageInfo",page);
        System.out.println("跳转成功！");
        return "list1";
    }
}
