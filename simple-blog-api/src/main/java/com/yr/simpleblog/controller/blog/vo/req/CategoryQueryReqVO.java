package com.yr.simpleblog.controller.blog.vo.req;

import lombok.Data;

import java.io.Serializable;

@Data
public class CategoryQueryReqVO implements Serializable {
    /**
     * 分类名称
     */
    private String name;
}
