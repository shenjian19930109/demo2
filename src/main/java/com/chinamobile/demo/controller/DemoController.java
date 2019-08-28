package com.chinamobile.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author shenjian
 * @Date 2019-08-21 23:27
 **/
@RestController
@RequestMapping("/demo")
public class DemoController {

    /**
     *  feature
     * */
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello world");
        return "world";
    }
}
