package com.yr.simpleblog.controller.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yurui
 * @date 2024-12-23 23:01
 */
@Data
public class ApiResponseResVO<T> implements Serializable {

    /**
     * 成功标志
     */
    private Boolean isSuccess;

    /**
     * 响应码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;


    public static <R> ApiResponseResVO<R> success(R data) {
        ApiResponseResVO<R> apiResponseResVO = new ApiResponseResVO<>();
        apiResponseResVO.setIsSuccess(Boolean.TRUE);
        apiResponseResVO.setData(data);
        return apiResponseResVO;
    }

    public static ApiResponseResVO fail(String code, String message) {
        ApiResponseResVO apiResponseResVO = new ApiResponseResVO();
        apiResponseResVO.setIsSuccess(Boolean.FALSE);
        apiResponseResVO.setCode(code);
        apiResponseResVO.setMessage(message);
        return apiResponseResVO;
    }
}
