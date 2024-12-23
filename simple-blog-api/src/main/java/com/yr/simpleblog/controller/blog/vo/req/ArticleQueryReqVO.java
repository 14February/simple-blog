package com.yr.simpleblog.controller.blog.vo.req;

import com.yr.simpleblog.common.PageReq;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yurui
 * @date 2024-12-23 23:01
 */
@Data
public class ArticleQueryReqVO extends PageReq implements Serializable {
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
}
