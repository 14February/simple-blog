package com.yr.simpleblog.controller.user.converter;

import com.yr.simpleblog.controller.user.vo.req.UserLoginReqVO;
import com.yr.simpleblog.controller.user.vo.req.UserRegisterReqVO;
import com.yr.simpleblog.controller.user.vo.res.UserResVO;
import com.yr.simpleblog.service.user.bo.UserBO;
import com.yr.simpleblog.service.user.bo.UserLoginReqBO;
import com.yr.simpleblog.service.user.bo.UserRegisterReqBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author yurui
 * @date 2024-12-26 13:02
 */
@Mapper
public interface UserControllerMapper {

    UserControllerMapper INSTANCE = Mappers.getMapper(UserControllerMapper.class);


    UserRegisterReqBO toUserRegisterReqBO(UserRegisterReqVO userRegisterReqVO);

    UserLoginReqBO toUserLoginReqBO(UserLoginReqVO userLoginReqVO);

    UserResVO toUserResVO(UserBO userBO);
}
