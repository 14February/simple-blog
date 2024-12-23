package com.yr.simpleblog.service.blog.bo.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yurui
 * @date 2024-12-23 23:01
 */
@Data
public class ArticleSaveOrUpdateReqBO implements Serializable {
    private Long id;
    private Long categoryId;
    private String title;
    private String content;
}
