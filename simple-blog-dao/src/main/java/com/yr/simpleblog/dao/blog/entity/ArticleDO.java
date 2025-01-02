package com.yr.simpleblog.dao.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author yurui
 * @date 2024-12-23 23:01
 */
@TableName("blog_article")
@Data
public class ArticleDO {
    @TableId(type = IdType.AUTO)
    private Long id;
    private Long categoryId;
    private String title;
    private String content;
    private Date createTime;
    private Integer isDelete;
}
