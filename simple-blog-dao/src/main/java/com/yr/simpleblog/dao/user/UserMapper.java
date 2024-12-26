package com.yr.simpleblog.dao.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yr.simpleblog.dao.user.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yurui
 * @date 2024-12-26 12:48
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

}
