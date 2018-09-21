package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

//    @RequestMapping("/page")
//    public String page3(Model model){
//        model.addAttribute("userName","张三");
//        return "hello";
//    }
//    @RequestMapping("info/more")
//    public String page2(){
//        return "hello2";
//    }

    @RequestMapping(value = "/index")
    public String hello(Model model) {
        model.addAttribute("name", "Dear");
        return "index";
    }
}
