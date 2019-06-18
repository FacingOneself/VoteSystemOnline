package com.lovelylm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Leiming
 * DateTime: 6/17/2019 3:13 PM
 */
@Controller
public class TestController {
    @RequestMapping("hello")
    public String hello(){
        return "5954";
    }
}
