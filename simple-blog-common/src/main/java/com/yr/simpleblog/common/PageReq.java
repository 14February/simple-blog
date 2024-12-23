package com.yr.simpleblog.common;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageReq implements Serializable {

    /**
     * 当前页码
     */
    private Integer pageIndex;

    /**
     * 每页条数
     */
    private Integer pageSize;

    /**
     * 排序规则列表
     */
    private List<SortRule> sortRuleList;

    @Data
    public static class SortRule implements Serializable {
        /**
         * 排序字段
         */
        private String field;
        /**
         * 排序规则
         */
        private String order;
    }
}
