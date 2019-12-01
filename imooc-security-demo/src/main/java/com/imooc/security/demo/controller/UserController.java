package com.imooc.security.demo.controller;

import com.imooc.security.demo.dto.User;
import com.imooc.security.demo.dto.UserQueryCondition;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lhh on 2019/12/1 18:12
 *
 * @Description:
 */
@RestController
@RequestMapping(value = "/user")
@Log4j
public class UserController {
    @GetMapping(value = "query")
    public List<User> query(UserQueryCondition condition, @PageableDefault(page = 2, size = 17, sort = "username,desc") Pageable pageable) {
        System.out.println(ReflectionToStringBuilder.toString(condition, ToStringStyle.MULTI_LINE_STYLE));
        System.out.println(pageable.getPageNumber());
        System.out.println(pageable.getPageSize());
        log.info("parse date: ");
        List<User> userList = new ArrayList<>();
        userList.add(new User());
        userList.add(new User());
        userList.add(new User());
        return userList;
    }
}
