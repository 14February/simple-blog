package com.yr.simpleblog.common.exception;


/**
 * @author yurui
 * @date 2024-12-08 00:13
 */
public class BizException extends RuntimeException {

    private String code;
    private String message;

    public BizException(String message) {
        super(message);
    }


    public BizException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }


    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
