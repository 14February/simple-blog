package com.yr.simpleblog.controller.user.vo.res;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yurui
 * @date 2024-12-26 13:22
 */
@Data
public class UserResVO implements Serializable {
    private String accountId;
    private String name;
    private String email;
    private String phone;
    private String password;
}
