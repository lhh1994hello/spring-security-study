package com.imooc.security.browser.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by lhh on 2019/12/1 18:13
 *
 * @Description:
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MyUser {
    private String username;
    private String password;

}
