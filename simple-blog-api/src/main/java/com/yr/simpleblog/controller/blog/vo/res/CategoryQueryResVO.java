package com.yr.simpleblog.controller.blog.vo.res;

import lombok.Data;

import java.io.Serializable;

@Data
public class CategoryQueryResVO implements Serializable {
    private Long id;
    private String name;
}
