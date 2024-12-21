package com.yr.simpleblog.dao.blog;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yr.simpleblog.dao.blog.entity.CategoryDO;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface CategoryMapper extends BaseMapper<CategoryDO> {

}
