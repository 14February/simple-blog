package com.yr.simpleblog.controller.blog.vo.res;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yurui
 * @date 2024-12-23 23:01
 */
@Data
public class CategoryQueryResVO implements Serializable {
    private Long id;
    private String name;
}
