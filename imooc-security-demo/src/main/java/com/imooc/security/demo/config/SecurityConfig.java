package com.imooc.security.demo.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by lhh on 2019/12/1 14:49
 *
 * @author lhh
 * @Description:
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //SpringBoot开发中关闭Security安全策略
/*    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().disable();
    }*/
}
