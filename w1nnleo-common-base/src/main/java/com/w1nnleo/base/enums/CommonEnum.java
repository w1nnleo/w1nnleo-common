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

    SUCCESS(0, "SUCCESS"),
    FAIL(-1, "FAIL"),
    ;

    private Integer code;
    private String msg;
}
