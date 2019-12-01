package com.imooc.security.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lhh on 2019/12/1 14:05
 *
 * @Description:
 */
@RestController
@RequestMapping(value = "/demo")

public class DemoController {
    @GetMapping(value = "/hello")
    public String hello() {
        return "hello spring security";
    }
}
