package com.yr.simpleblog.service.user;

import com.yr.simpleblog.service.user.bo.UserBO;
import com.yr.simpleblog.service.user.bo.UserLoginReqBO;
import com.yr.simpleblog.service.user.bo.UserRegisterReqBO;

/**
 * @author yurui
 * @date 2024-12-26 12:36
 */
public interface UserManagement {

    /**
     * 登录
     *
     * @param userLoginReqBO
     */
    String login(UserLoginReqBO userLoginReqBO);

    /**
     * 注册
     * @param userRegisterReqBO
     */
    void register(UserRegisterReqBO userRegisterReqBO);

    /**
     * 获取当前登录用户
     *
     * @param token token
     * @return 当前登录用户
     */
    UserBO getCurrentUser(String token);
}
