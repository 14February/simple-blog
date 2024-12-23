package com.yr.simpleblog.service.blog.converter;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yr.simpleblog.common.PageRes;
import com.yr.simpleblog.dao.blog.entity.ArticleDO;
import com.yr.simpleblog.dao.blog.entity.CategoryDO;
import com.yr.simpleblog.service.blog.bo.req.ArticleSaveOrUpdateReqBO;
import com.yr.simpleblog.service.blog.bo.req.CategorySaveOrUpdateReqBO;
import com.yr.simpleblog.service.blog.bo.res.ArticleQueryResBO;
import com.yr.simpleblog.service.blog.bo.res.CategoryQueryResBO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface BlogManagementMapper {

    BlogManagementMapper INSTANCE = Mappers.getMapper(BlogManagementMapper.class);


    CategoryDO toCategoryDO(CategorySaveOrUpdateReqBO categorySaveOrUpdateReqBO);

    List<CategoryQueryResBO> toCategoryQueryResBOList(List<CategoryDO> categoryDOList);

    ArticleDO toArticleDO(ArticleSaveOrUpdateReqBO articleSaveOrUpdateReqBO);


    @Mapping(target = "pageIndex", source = "current")
    @Mapping(target = "pageSize", source = "size")
    @Mapping(target = "total", source = "total")
    @Mapping(target = "dataList", source = "records")
    PageRes<ArticleQueryResBO> toArticlePageRes(Page<ArticleDO> articleDOPage);

}
