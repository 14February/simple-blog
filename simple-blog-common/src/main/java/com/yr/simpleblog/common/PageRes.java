package com.yr.simpleblog.common;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author yurui
 * @date 2024-12-23 23:01
 */
@Data
public class PageRes<T> implements Serializable {
    /**
     * 当前页码
     */
    private Integer pageIndex;

    /**
     * 每页条数
     */
    private Integer pageSize;

    /**
     * 总条数
     */
    private Long total;

    /**
     * 数据
     */
    private List<T> dataList;

    public PageRes() {
    }

    public PageRes(Integer pageIndex, Integer pageSize, Long total, List<T> dataList) {
        this.pageIndex = pageIndex;
        this.pageSize = pageSize;
        this.total = total;
        this.dataList = dataList;
    }

    public static PageRes initPage(PageReq pageReq) {
        PageRes pageRes = new PageRes();
        Integer pageIndex;
        Integer pageSize;
        if (pageReq == null) {
            pageIndex = 1;
            pageSize = 10;
        } else {
            pageIndex = pageReq.getPageIndex();
            pageSize = pageReq.getPageSize();
        }
        pageRes.setPageIndex(pageIndex);
        pageRes.setPageSize(pageSize);
        pageRes.setTotal(0L);
        return pageRes;
    }
}
