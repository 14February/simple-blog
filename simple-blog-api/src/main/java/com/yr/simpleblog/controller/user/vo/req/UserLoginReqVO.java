package com.yr.simpleblog.controller.user.vo.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yurui
 * @date 2024-12-25 23:20
 */
@Data
public class UserLoginReqVO implements Serializable {
    private String account;
    private String password;
}
