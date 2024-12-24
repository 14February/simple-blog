package com.yr.simpleblog.controller.blog.converter;
import com.yr.simpleblog.common.PageRes;
import com.yr.simpleblog.controller.blog.vo.req.ArticleQueryReqVO;
import com.yr.simpleblog.controller.blog.vo.req.ArticleSaveOrUpdateReqVO;
import com.yr.simpleblog.controller.blog.vo.req.CategoryQueryReqVO;
import com.yr.simpleblog.controller.blog.vo.req.CategorySaveOrUpdateReqVO;
import com.yr.simpleblog.controller.blog.vo.res.ArticleQueryResVO;
import com.yr.simpleblog.controller.blog.vo.res.CategoryQueryResVO;
import com.yr.simpleblog.service.blog.bo.req.ArticleQueryReqBO;
import com.yr.simpleblog.service.blog.bo.req.ArticleSaveOrUpdateReqBO;
import com.yr.simpleblog.service.blog.bo.req.CategoryQueryReqBO;
import com.yr.simpleblog.service.blog.bo.req.CategorySaveOrUpdateReqBO;
import com.yr.simpleblog.service.blog.bo.res.ArticleQueryResBO;
import com.yr.simpleblog.service.blog.bo.res.CategoryQueryResBO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import java.util.List;

/**
 * @author yurui
 * @date 2024-12-23 23:55
 */
@Mapper
public interface BlogControllerMapper {

    BlogControllerMapper INSTANCE = Mappers.getMapper(BlogControllerMapper.class);

    CategorySaveOrUpdateReqBO toCategorySaveOrUpdateReqBO(CategorySaveOrUpdateReqVO categorySaveOrUpdateReqVO);

    CategoryQueryReqBO toCategoryQueryReqBO(CategoryQueryReqVO categoryQueryReqVO);

    List<CategoryQueryResVO> toCategoryQueryResVOList(List<CategoryQueryResBO> categoryQueryResBOList);

    ArticleSaveOrUpdateReqBO toArticleSaveOrUpdateReqBO(ArticleSaveOrUpdateReqVO articleSaveOrUpdateReqVO);

    ArticleQueryReqBO toArticleQueryReqBO(ArticleQueryReqVO articleQueryReqVO);

    @Mapping(source = "dataList", target = "dataList")
    PageRes<ArticleQueryResVO> toArticlePageRes(PageRes<ArticleQueryResBO> articleQueryResBOPageRes);
}
