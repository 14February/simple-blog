package com.yr.simpleblog.service.user.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yurui
 * @date 2024-12-25 23:20
 */
@Data
public class UserLoginReqBO implements Serializable {
    private String name;
    private String email;
    private String phone;
    private String password;
}
