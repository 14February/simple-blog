package com.yr.simpleblog.service.blog.bo.res;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yurui
 * @date 2024-12-23 23:27
 */
@Data
public class ArticleQueryResBO implements Serializable {
    private Long id;
    private String title;
    private String content;
    private Date createTime;
}
