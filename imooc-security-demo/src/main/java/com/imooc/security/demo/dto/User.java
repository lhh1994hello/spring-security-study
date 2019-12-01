package com.imooc.security.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by lhh on 2019/12/1 18:13
 *
 * @Description:
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private String username;
    private String password;

}
