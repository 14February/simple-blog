package com.yr.simpleblog.controller.user;

import com.yr.simpleblog.controller.TokenUtils;
import com.yr.simpleblog.controller.user.converter.UserControllerMapper;
import com.yr.simpleblog.controller.user.vo.req.UserLoginReqVO;
import com.yr.simpleblog.controller.user.vo.req.UserRegisterReqVO;
import com.yr.simpleblog.controller.user.vo.res.UserResVO;
import com.yr.simpleblog.service.user.UserManagement;
import com.yr.simpleblog.service.user.bo.UserBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author yurui
 * @date 2024-12-25 23:06
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserManagement userManagement;

    @Autowired
    private HttpServletResponse httpServletResponse;

    @Autowired
    private HttpServletRequest httpServletRequest;

    @PostMapping("/register")
    public void register(@RequestBody UserRegisterReqVO userRegisterReqVO) {
        userManagement.register(UserControllerMapper.INSTANCE.toUserRegisterReqBO(userRegisterReqVO));
    }

    @PostMapping("/login")
    public void login(@RequestBody UserLoginReqVO userLoginReqVO) {
        String token = userManagement.login(UserControllerMapper.INSTANCE.toUserLoginReqBO(userLoginReqVO));
        TokenUtils.addToken(httpServletResponse, token);
    }

    @GetMapping("/current/get")
    public UserResVO getCurrentUser() {
        String token = TokenUtils.getValueFromCookie(httpServletRequest, "token");
        if (token == null) {
            return null;
        }
        UserBO userBO = userManagement.getCurrentUser(token);
        if (userBO == null) {
            return null;
        }
        return UserControllerMapper.INSTANCE.toUserResVO(userBO);
    }


}
