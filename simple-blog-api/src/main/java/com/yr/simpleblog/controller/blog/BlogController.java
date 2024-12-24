package com.yr.simpleblog.controller.blog;

import com.yr.simpleblog.common.page.PageRes;
import com.yr.simpleblog.controller.blog.converter.BlogControllerMapper;
import com.yr.simpleblog.controller.blog.vo.req.ArticleQueryReqVO;
import com.yr.simpleblog.controller.blog.vo.req.ArticleSaveOrUpdateReqVO;
import com.yr.simpleblog.controller.blog.vo.req.CategoryQueryReqVO;
import com.yr.simpleblog.controller.blog.vo.req.CategorySaveOrUpdateReqVO;
import com.yr.simpleblog.controller.blog.vo.res.ArticleQueryResVO;
import com.yr.simpleblog.controller.blog.vo.res.CategoryQueryResVO;
import com.yr.simpleblog.controller.common.ApiResponseResVO;
import com.yr.simpleblog.service.blog.BlogManagement;
import com.yr.simpleblog.service.blog.bo.res.ArticleQueryResBO;
import com.yr.simpleblog.service.blog.bo.res.CategoryQueryResBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;


/**
 * @author yurui
 * @date 2024-12-23 23:01
 */
@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogManagement blogManagement;

    /**
     * 新增分类
     *
     * @param categorySaveOrUpdateReqVO 参数
     * @return true
     */
    @PostMapping("/category/add")
    public ApiResponseResVO<Boolean> addCategory(@RequestBody CategorySaveOrUpdateReqVO categorySaveOrUpdateReqVO){
        return ApiResponseResVO.success(blogManagement.addCategory(BlogControllerMapper.INSTANCE.toCategorySaveOrUpdateReqBO(categorySaveOrUpdateReqVO)));
    }

    /**
     * 修改分类
     *
     * @param categorySaveOrUpdateReqVO 参数
     * @return true
     */
    @PostMapping("/category/update")
    public ApiResponseResVO<Boolean> updateCategory(@RequestBody CategorySaveOrUpdateReqVO categorySaveOrUpdateReqVO){
        return ApiResponseResVO.success(blogManagement.updateCategory(BlogControllerMapper.INSTANCE.toCategorySaveOrUpdateReqBO(categorySaveOrUpdateReqVO)));
    }

    /**
     * 查询分类列表
     *
     * @param categoryQueryReqVO 查询参数
     * @return 分类列表
     */
    @GetMapping("/category/query")
    public ApiResponseResVO<List<CategoryQueryResVO>> queryCategory(CategoryQueryReqVO categoryQueryReqVO){
        List<CategoryQueryResBO> categoryQueryResBOList =
                blogManagement.queryCategory(BlogControllerMapper.INSTANCE.toCategoryQueryReqBO(categoryQueryReqVO));
        if (CollectionUtils.isEmpty(categoryQueryResBOList)) {
            return ApiResponseResVO.success(Collections.emptyList());
        }
        return ApiResponseResVO.success(BlogControllerMapper.INSTANCE.toCategoryQueryResVOList(categoryQueryResBOList));
    }

    /**
     * 添加文章
     *
     * @param articleSaveOrUpdateReqVO 参数
     * @return true
     */
    @PostMapping("/article/add")
    public ApiResponseResVO<Boolean> addArticle(@RequestBody ArticleSaveOrUpdateReqVO articleSaveOrUpdateReqVO) {
        return ApiResponseResVO.success(blogManagement.addArticle(BlogControllerMapper.INSTANCE.toArticleSaveOrUpdateReqBO(articleSaveOrUpdateReqVO)));
    }

    /**
     * 修改文章
     *
     * @param articleSaveOrUpdateReqVO 参数
     * @return true
     */
    @PostMapping("/article/update")
    public ApiResponseResVO<Boolean> updateArticle(@RequestBody ArticleSaveOrUpdateReqVO articleSaveOrUpdateReqVO) {
        return ApiResponseResVO.success(blogManagement.updateArticle(BlogControllerMapper.INSTANCE.toArticleSaveOrUpdateReqBO(articleSaveOrUpdateReqVO)));
    }

    /**
     * 分页查询文章列表
     *
     * @param articleQueryReqVO 查询参数
     * @return 文章列表
     */
    @PostMapping("/article/page")
    public ApiResponseResVO<PageRes<ArticleQueryResVO>> pageArticle(@RequestBody ArticleQueryReqVO articleQueryReqVO) {
        PageRes<ArticleQueryResBO> articleQueryResBOPageRes = blogManagement.pageArticle(BlogControllerMapper.INSTANCE.toArticleQueryReqBO(articleQueryReqVO));
        return ApiResponseResVO.success(BlogControllerMapper.INSTANCE.toArticlePageRes(articleQueryResBOPageRes));
    }

}
