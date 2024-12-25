package com.yr.simpleblog.controller.user;

import com.yr.simpleblog.controller.user.vo.req.UserLoginReqVO;
import com.yr.simpleblog.controller.user.vo.req.UserRegisterReqVO;
import org.springframework.web.bind.annotation.*;

/**
 * @author yurui
 * @date 2024-12-25 23:06
 */
@RequestMapping("/user")
@RestController
public class UserController {


    @PostMapping("/register")
    public void register(@RequestBody UserRegisterReqVO userRegisterReqVO) {

    }

    @PostMapping("/login")
    public void login(@RequestBody UserLoginReqVO userLoginReqVO) {

    }

    @GetMapping("/current/get")
    public void getCurrentUser() {

    }


}
