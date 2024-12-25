package com.yr.simpleblog.controller.user.vo.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yurui
 * @date 2024-12-25 23:12
 */
@Data
public class UserRegisterReqVO implements Serializable {
    private String name;
    private String email;
    private String phone;
    private String password;
}
