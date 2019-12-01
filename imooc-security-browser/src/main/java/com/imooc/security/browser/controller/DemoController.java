package com.imooc.security.browser.controller;

import com.imooc.security.browser.dto.MyUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lhh on 2019/12/1 19:53
 *
 * @Description:
 */
@RestController
@RequestMapping(value = "/demo")
public class DemoController {
    @GetMapping(value = "user")
    public List<MyUser> query() {
        List<MyUser> myUserList = new ArrayList<>();
        myUserList.add(new MyUser("张三", "123"));
        myUserList.add(new MyUser("李四", "123"));
        myUserList.add(new MyUser("王五", "123"));
        return myUserList;
    }

}
