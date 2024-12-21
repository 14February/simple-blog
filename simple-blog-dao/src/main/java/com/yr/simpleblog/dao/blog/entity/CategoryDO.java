package com.yr.simpleblog.dao.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("blog_category")
@Data
public class CategoryDO {
    @TableId(type = IdType.AUTO)
    private Long id;
    @TableField("category_name")
    private String name;
}
