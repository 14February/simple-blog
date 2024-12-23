package com.yr.simpleblog.service.blog;

import com.yr.simpleblog.common.PageRes;
import com.yr.simpleblog.service.blog.bo.req.ArticleQueryReqBO;
import com.yr.simpleblog.service.blog.bo.req.ArticleSaveOrUpdateReqBO;
import com.yr.simpleblog.service.blog.bo.req.CategoryQueryReqBO;
import com.yr.simpleblog.service.blog.bo.req.CategorySaveOrUpdateReqBO;
import com.yr.simpleblog.service.blog.bo.res.ArticleQueryResBO;
import com.yr.simpleblog.service.blog.bo.res.CategoryQueryResBO;

import java.util.List;

/**
 * @author yurui
 * @date 2024-12-23 23:01
 */
public interface BlogManagement {

    /**
     * 新增分类
     * @param categorySaveOrUpdateReqBO 参数
     * @return true
     */
    Boolean addCategory(CategorySaveOrUpdateReqBO categorySaveOrUpdateReqBO);

    /**
     * 修改分类
     * @param categorySaveOrUpdateReqBO 参数
     * @return true
     */
    Boolean updateCategory(CategorySaveOrUpdateReqBO categorySaveOrUpdateReqBO);

    /**
     * 查询分类列表
     * @param categoryQueryReqBO 查询参数
     * @return 分类列表
     */
    List<CategoryQueryResBO> queryCategory(CategoryQueryReqBO categoryQueryReqBO);

    /**
     * 新增文章
     *
     * @param articleSaveOrUpdateReqBO 参数
     * @return  true
     */
    Boolean addArticle(ArticleSaveOrUpdateReqBO articleSaveOrUpdateReqBO);

    /**
     * 更新文章
     *
     * @param articleSaveOrUpdateReqBO 文章
     * @return true
     */
    Boolean updateArticle(ArticleSaveOrUpdateReqBO articleSaveOrUpdateReqBO);


    /**
     * 分页查询文章列表
     *
     * @param articleQueryReqBO 查询参数
     * @return 文章列表
     */
    PageRes<ArticleQueryResBO> pageArticle(ArticleQueryReqBO articleQueryReqBO);
}
