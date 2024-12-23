package com.yr.simpleblog.service.blog.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yr.simpleblog.dao.blog.CategoryMapper;
import com.yr.simpleblog.dao.blog.entity.CategoryDO;
import com.yr.simpleblog.service.blog.BlogManagement;
import com.yr.simpleblog.service.blog.bo.req.CategoryQueryReqBO;
import com.yr.simpleblog.service.blog.bo.req.CategorySaveOrUpdateReqBO;
import com.yr.simpleblog.service.blog.bo.res.CategoryQueryResBO;
import com.yr.simpleblog.service.blog.converter.BlogManagementMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;


@Service
public class BlogManagementImpl implements BlogManagement {

    @Autowired
    private CategoryMapper categoryMapper;

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
}
