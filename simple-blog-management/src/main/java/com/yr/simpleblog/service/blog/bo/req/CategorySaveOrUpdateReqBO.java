package com.yr.simpleblog.service.blog.bo.req;

import lombok.Data;

@Data
public class CategorySaveOrUpdateReqBO {
    private Long id;
    private String name;
}
