package com.yr.simpleblog.controller.blog;

import com.alibaba.fastjson.JSON;
import com.yr.simpleblog.controller.blog.vo.req.CategoryQueryReqVO;
import com.yr.simpleblog.controller.blog.vo.req.CategorySaveOrUpdateReqVO;
import com.yr.simpleblog.controller.blog.vo.res.CategoryQueryResVO;
import com.yr.simpleblog.service.blog.BlogManagement;
import com.yr.simpleblog.service.blog.bo.req.CategoryQueryReqBO;
import com.yr.simpleblog.service.blog.bo.req.CategorySaveOrUpdateReqBO;
import com.yr.simpleblog.service.blog.bo.res.CategoryQueryResBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private BlogManagement blogManagement;

    @PostMapping("/category/add")
    public Boolean addCategory(@RequestBody CategorySaveOrUpdateReqVO categorySaveOrUpdateReqVO){
        return blogManagement.addCategory(JSON.parseObject(JSON.toJSONString(categorySaveOrUpdateReqVO), CategorySaveOrUpdateReqBO.class));
    }

    @PostMapping("/category/update")
    public Boolean updateCategory(@RequestBody CategorySaveOrUpdateReqVO categorySaveOrUpdateReqVO){
        return blogManagement.updateCategory(JSON.parseObject(JSON.toJSONString(categorySaveOrUpdateReqVO), CategorySaveOrUpdateReqBO.class));
    }


    @GetMapping("/category/query")
    public List<CategoryQueryResVO> queryCategory(CategoryQueryReqVO categoryQueryReqVO){
        List<CategoryQueryResBO> categoryQueryResBOList =
                blogManagement.queryCategory(JSON.parseObject(JSON.toJSONString(categoryQueryReqVO), CategoryQueryReqBO.class));
        if (CollectionUtils.isEmpty(categoryQueryResBOList)) {
            return Collections.emptyList();
        }
        return JSON.parseArray(JSON.toJSONString(categoryQueryResBOList), CategoryQueryResVO.class);
    }
}
