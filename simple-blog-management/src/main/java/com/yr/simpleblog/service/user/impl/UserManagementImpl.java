package com.yr.simpleblog.service.user.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yr.simpleblog.dao.user.UserMapper;
import com.yr.simpleblog.dao.user.entity.UserDO;
import com.yr.simpleblog.service.user.UserManagement;
import com.yr.simpleblog.service.user.bo.UserBO;
import com.yr.simpleblog.service.user.bo.UserLoginReqBO;
import com.yr.simpleblog.service.user.bo.UserRegisterReqBO;
import com.yr.simpleblog.service.user.converter.UserManagementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author yurui
 * @date 2024-12-26 12:36
 */
@Service
public class UserManagementImpl implements UserManagement {

    public static final Map<String, UserBO> LOGIN_USER_MAP = new HashMap<>();

    @Autowired
    private UserMapper userMapper;


    @Override
    public String login(UserLoginReqBO userLoginReqBO) {
        // 1. 判断用户名和密码的正确性
        List<UserDO> userDOList = userMapper.selectList(new LambdaQueryWrapper<UserDO>()
                .eq(UserDO::getName, userLoginReqBO.getName())
                .eq(UserDO::getEmail, userLoginReqBO.getEmail())
                .eq(UserDO::getPhone, userLoginReqBO.getPhone())
                .eq(UserDO::getPassword, userLoginReqBO.getPassword()));
        if (CollectionUtils.isEmpty(userDOList)) {
            throw new RuntimeException("用户名或密码不正确");
        }
        UserBO userBO = UserManagementMapper.INSTANCE.toUserBO(userDOList.get(0));
        String token = UUID.randomUUID().toString();
        LOGIN_USER_MAP.put(token, userBO);
        return token;
    }

    @Override
    public void register(UserRegisterReqBO userRegisterReqBO) {
        // 1. 判断是否注册
        List<UserDO> userDOList = userMapper.selectList(new LambdaQueryWrapper<UserDO>()
                .eq(UserDO::getName, userRegisterReqBO.getName())
                .eq(UserDO::getEmail, userRegisterReqBO.getEmail())
                .eq(UserDO::getPhone, userRegisterReqBO.getPhone()));
        if (!CollectionUtils.isEmpty(userDOList)) {
            throw new RuntimeException("用户已注册");
        }
        // 2. 注册
        userRegisterReqBO.setAccountId(UUID.randomUUID().toString().replace("-", ""));
        userMapper.insert(UserManagementMapper.INSTANCE.toUserDO(userRegisterReqBO));
    }

    @Override
    public UserBO getCurrentUser(String token) {
        return LOGIN_USER_MAP.get(token);
    }
}
