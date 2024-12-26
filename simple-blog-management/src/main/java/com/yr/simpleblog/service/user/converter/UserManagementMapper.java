package com.yr.simpleblog.service.user.converter;

import com.yr.simpleblog.dao.user.entity.UserDO;
import com.yr.simpleblog.service.user.bo.UserBO;
import com.yr.simpleblog.service.user.bo.UserRegisterReqBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author yurui
 * @date 2024-12-26 12:59
 */
@Mapper
public interface UserManagementMapper {

    UserManagementMapper INSTANCE = Mappers.getMapper(UserManagementMapper.class);


    UserDO toUserDO(UserRegisterReqBO userRegisterReqBO);

    UserBO toUserBO(UserDO userDO);
}
