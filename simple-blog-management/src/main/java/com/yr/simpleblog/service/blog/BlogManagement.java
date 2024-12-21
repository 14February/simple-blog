package com.yr.simpleblog.service.blog;

import com.yr.simpleblog.service.blog.bo.req.CategoryQueryReqBO;
import com.yr.simpleblog.service.blog.bo.req.CategorySaveOrUpdateReqBO;
import com.yr.simpleblog.service.blog.bo.res.CategoryQueryResBO;

import java.util.List;

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

}
