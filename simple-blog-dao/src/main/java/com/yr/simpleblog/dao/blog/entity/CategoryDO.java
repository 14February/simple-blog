package com.yr.simpleblog.dao.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author yurui
 * @date 2024-12-23 23:01
 */
@TableName("blog_category")
@Data
public class CategoryDO {
    @TableId(type = IdType.AUTO)
    private Long id;
    @TableField("category_name")
    private String name;
}
