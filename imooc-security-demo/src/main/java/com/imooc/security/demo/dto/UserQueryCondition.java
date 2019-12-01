package com.imooc.security.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by lhh on 2019/12/1 18:24
 *
 * @Description:
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserQueryCondition {
    private String username;
    private int age;
    private int ageTo;
    private String other;

}
