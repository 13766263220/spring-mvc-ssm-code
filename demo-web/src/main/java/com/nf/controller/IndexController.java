package com.nf.controller;

import com.github.pagehelper.PageInfo;
import com.nf.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @Autowired
    private StaffService staffService;

    @RequestMapping("/index")
    public String index(Model model){
        PageInfo pageInfo = new PageInfo(staffService.getAll(2, 4));
        model.addAttribute("pageInfo",pageInfo);
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        System.out.println(666666);
        return "";
    }
}
