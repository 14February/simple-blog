package com.yr.simpleblog.service.blog.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yr.simpleblog.common.page.PageRes;
import com.yr.simpleblog.dao.blog.ArticleMapper;
import com.yr.simpleblog.dao.blog.CategoryMapper;
import com.yr.simpleblog.dao.blog.entity.ArticleDO;
import com.yr.simpleblog.dao.blog.entity.CategoryDO;
import com.yr.simpleblog.service.blog.BlogManagement;
import com.yr.simpleblog.service.blog.bo.req.ArticleQueryReqBO;
import com.yr.simpleblog.service.blog.bo.req.ArticleSaveOrUpdateReqBO;
import com.yr.simpleblog.service.blog.bo.req.CategoryQueryReqBO;
import com.yr.simpleblog.service.blog.bo.req.CategorySaveOrUpdateReqBO;
import com.yr.simpleblog.service.blog.bo.res.ArticleQueryResBO;
import com.yr.simpleblog.service.blog.bo.res.CategoryQueryResBO;
import com.yr.simpleblog.service.blog.converter.BlogManagementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * @author yurui
 * @date 2024-12-23 23:01
 */
@Service
public class BlogManagementImpl implements BlogManagement {

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private ArticleMapper articleMapper;

    @Override
    public Boolean addCategory(CategorySaveOrUpdateReqBO categorySaveOrUpdateReqBO) {
        return categoryMapper.insert(BlogManagementMapper.INSTANCE.toCategoryDO(categorySaveOrUpdateReqBO)) == 1;
    }

    @Override
    public Boolean updateCategory(CategorySaveOrUpdateReqBO categorySaveOrUpdateReqBO) {
        return categoryMapper.updateById(BlogManagementMapper.INSTANCE.toCategoryDO(categorySaveOrUpdateReqBO)) == 1;
    }

    @Override
    public List<CategoryQueryResBO> queryCategory(CategoryQueryReqBO categoryQueryReqBO) {
        List<CategoryDO> categoryDOList = categoryMapper.selectList(new LambdaQueryWrapper<>(CategoryDO.class)
                .like(CategoryDO::getName, categoryQueryReqBO.getName()));
        if (CollectionUtils.isEmpty(categoryDOList)) {
            return Collections.emptyList();
        }
        return BlogManagementMapper.INSTANCE.toCategoryQueryResBOList(categoryDOList);
    }

    @Override
    public Boolean addArticle(ArticleSaveOrUpdateReqBO articleSaveOrUpdateReqBO) {
        return articleMapper.insert(BlogManagementMapper.INSTANCE.toArticleDO(articleSaveOrUpdateReqBO)) == 1;
    }

    @Override
    public Boolean updateArticle(ArticleSaveOrUpdateReqBO articleSaveOrUpdateReqBO) {
        return articleMapper.updateById(BlogManagementMapper.INSTANCE.toArticleDO(articleSaveOrUpdateReqBO)) == 1;
    }

    @Override
    public PageRes<ArticleQueryResBO> pageArticle(ArticleQueryReqBO articleQueryReqBO) {
        Page<ArticleDO> page = articleMapper.selectPage(new Page<>(articleQueryReqBO.getPageIndex(), articleQueryReqBO.getPageSize(), true),
                new LambdaQueryWrapper<>(ArticleDO.class)
                        .like(ArticleDO::getTitle, articleQueryReqBO.getTitle())
                        .like(ArticleDO::getContent, articleQueryReqBO.getContent()));
        if (page == null) {
            return PageRes.initPage(articleQueryReqBO);
        }
        return BlogManagementMapper.INSTANCE.toArticlePageRes(page);
    }
}
