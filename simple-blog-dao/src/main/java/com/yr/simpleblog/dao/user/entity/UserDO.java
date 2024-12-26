package com.yr.simpleblog.dao.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author yurui
 * @date 2024-12-26 12:49
 */
@Data
@TableName("user")
public class UserDO {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String accountId;

    private String name;

    private String password;

    private String email;

    private String phone;

    private String avatar;

    private String status;

}
