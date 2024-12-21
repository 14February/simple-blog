package com.yr.simpleblog.controller.blog.vo.req;

import lombok.Data;

import java.io.Serializable;

@Data
public class CategorySaveOrUpdateReqVO implements Serializable {
    private Long id;

    /**
     * 分类名称
     */
    private String name;

}
