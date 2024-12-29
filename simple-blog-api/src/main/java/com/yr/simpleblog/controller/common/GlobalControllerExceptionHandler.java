package com.yr.simpleblog.controller.common;

import com.yr.simpleblog.common.exception.BizException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author yurui
 * @date 2024-12-28 00:09
 */
@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    private static final String DEFAULT_ERROR_CODE = "500";

    @ExceptionHandler(BizException.class)
    public ApiResponseResVO handleBizException(BizException bizException) {
        return ApiResponseResVO.fail(bizException.getCode(), bizException.getMessage());
    }

    @ExceptionHandler(Throwable.class)
    public ApiResponseResVO handleException(Throwable throwable) {
        return ApiResponseResVO.fail(DEFAULT_ERROR_CODE, "系统异常");
    }


}
