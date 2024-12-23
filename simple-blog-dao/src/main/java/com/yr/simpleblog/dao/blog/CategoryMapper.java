package com.yr.simpleblog.dao.blog;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yr.simpleblog.dao.blog.entity.CategoryDO;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author yurui
 * @date 2024-12-23 23:01
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryDO> {

}
