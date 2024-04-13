package ru.gb.spring4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

    @RequestMapping("/hello")
    public String getHello() {
        return "hello";
    }
}
