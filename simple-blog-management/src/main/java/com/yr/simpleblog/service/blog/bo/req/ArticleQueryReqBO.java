package com.yr.simpleblog.service.blog.bo.req;

import com.yr.simpleblog.common.page.PageReq;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yurui
 * @date 2024-12-23 23:19
 */
@Data
public class ArticleQueryReqBO extends PageReq implements Serializable {
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;

    private Long id;
}
