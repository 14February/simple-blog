package com.yr.simpleblog.controller.blog.vo.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yurui
 * @date 2024-12-23 23:01
 */
@Data
public class CategorySaveOrUpdateReqVO implements Serializable {
    private Long id;

    /**
     * 分类名称
     */
    private String name;

}
