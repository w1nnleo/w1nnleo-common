package com.w1nnleo.exception.entity;

import com.w1nnleo.exception.constant.Constant;

/**
 * @Author: w1nnleo
 * @date: 2023/2/15
 * @Description:
 */

public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(Integer code, String msg) {
        super(code + Constant.COMMA + msg);
    }
}
