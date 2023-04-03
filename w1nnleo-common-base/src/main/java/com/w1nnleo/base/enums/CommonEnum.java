package com.w1nnleo.base.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: w1nnleo
 * @date: 2023/2/15
 * @Description:
 */
@Getter
@AllArgsConstructor
public enum CommonEnum {

    SUCCESS(200, "SUCCESS"),
    FAIL(500, "FAIL"),
    ;

    private Integer code;
    private String msg;
}
