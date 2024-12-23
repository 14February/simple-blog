package com.yr.simpleblog.controller.blog.converter;
import com.yr.simpleblog.controller.blog.vo.req.CategoryQueryReqVO;
import com.yr.simpleblog.controller.blog.vo.req.CategorySaveOrUpdateReqVO;
import com.yr.simpleblog.controller.blog.vo.res.CategoryQueryResVO;
import com.yr.simpleblog.service.blog.bo.req.CategoryQueryReqBO;
import com.yr.simpleblog.service.blog.bo.req.CategorySaveOrUpdateReqBO;
import com.yr.simpleblog.service.blog.bo.res.CategoryQueryResBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BlogControllerMapper {

    BlogControllerMapper INSTANCE = Mappers.getMapper(BlogControllerMapper.class);


    CategorySaveOrUpdateReqBO toCategorySaveOrUpdateReqBO(CategorySaveOrUpdateReqVO categorySaveOrUpdateReqVO);

    CategoryQueryReqBO toCategoryQueryReqBO(CategoryQueryReqVO categoryQueryReqVO);

    List<CategoryQueryResVO> toCategoryQueryResVOList(List<CategoryQueryResBO> categoryQueryResBOList);

}
