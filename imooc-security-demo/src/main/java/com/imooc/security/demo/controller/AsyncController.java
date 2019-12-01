package com.imooc.security.demo.controller;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

/**
 * Created by lhh on 2019/12/1 18:50
 *
 * @Description:
 */
@RestController
@RequestMapping(value = "/async")
@Log4j
public class AsyncController {
    /**
     * 多线程测试
     *
     * @return
     */
    @RequestMapping(value = "/order")
    public Callable<String> order() {
        log.info("主线程开始...");
        //开启一个子线程执行其他业务逻辑
        Callable<String> result = new Callable<String>() {
            @Override
            public String call() throws Exception {
                log.info("副线程开始...");
                Thread.sleep(2000);
                log.info("副线程结束...");
                return "success";
            }
        };
        log.info("主线程结束...");
        return result;
    }
}
