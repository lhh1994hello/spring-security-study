package com.imooc.security.browser.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lhh on 2019/12/1 21:42
 *
 * @Description:
 */
@Controller
@Log4j
public class CommonController {
    @RequestMapping(value = "/login")
    public String login() {
        log.info("登录请求...");
        return "login";
    }
}
