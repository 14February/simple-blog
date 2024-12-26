package com.yr.simpleblog.service.user.bo;

import lombok.Data;

/**
 * @author yurui
 * @date 2024-12-26 13:10
 */
@Data
public class UserBO {
    private Long id;

    private String accountId;

    private String name;

    private String password;

    private String email;

    private String phone;

    private String avatar;

    private String status;
}
