package com.yr.simpleblog.service.blog.converter;

import com.yr.simpleblog.dao.blog.entity.CategoryDO;
import com.yr.simpleblog.service.blog.bo.req.CategorySaveOrUpdateReqBO;
import com.yr.simpleblog.service.blog.bo.res.CategoryQueryResBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BlogManagementMapper {

    BlogManagementMapper INSTANCE = Mappers.getMapper(BlogManagementMapper.class);


    CategoryDO toCategoryDO(CategorySaveOrUpdateReqBO categorySaveOrUpdateReqBO);

    List<CategoryQueryResBO> toCategoryQueryResBOList(List<CategoryDO> categoryDOList);
}
