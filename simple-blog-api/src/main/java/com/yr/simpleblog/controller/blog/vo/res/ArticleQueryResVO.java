package com.yr.simpleblog.controller.blog.vo.res;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yurui
 * @date 2024-12-23 23:01
 */
@Data
public class ArticleQueryResVO implements Serializable {
    private Long id;
    private String title;
    private String content;
    private Date createTime;
}
