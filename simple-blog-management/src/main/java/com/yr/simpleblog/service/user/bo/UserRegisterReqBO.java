package com.yr.simpleblog.service.user.bo;

import lombok.Data;

/**
 * @author yurui
 * @date 2024-12-26 12:36
 */
@Data
public class UserRegisterReqBO {
    private String accountId;
    private String name;
    private String email;
    private String phone;
    private String password;
}
