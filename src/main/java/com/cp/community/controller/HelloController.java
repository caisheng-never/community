package com.cp.community.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


//@RestController==>@Controller+@ResponseBody 返回的是字符串
//@RestController
@Controller
@RequestMapping("hello")
public class HelloController {
    @GetMapping("show")
    public String hello(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("aa", name);
        return "hello";
    }
}
