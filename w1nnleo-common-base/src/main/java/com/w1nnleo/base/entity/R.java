package com.w1nnleo.base.entity;

import com.w1nnleo.base.enums.CommonEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: w1nnleo
 * @date: 2023/2/15
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class R<T> {

    private T data;

    private Integer code;

    private String msg;

    public static <T> R<T> ok() {
        return R.<T>builder().code(CommonEnum.SUCCESS.getCode()).msg(CommonEnum.SUCCESS.getMsg()).build();
    }

    public static <T> R<T> ok(T data) {
        return R.<T>builder().data(data).code(CommonEnum.SUCCESS.getCode()).msg(CommonEnum.SUCCESS.getMsg()).build();
    }

    public static <T> R<T> ok(T data, Integer code, String msg) {
        return R.<T>builder().data(data).code(code).msg(msg).build();
    }

    public static <T> R<T> fail() {
        return R.<T>builder().code(CommonEnum.FAIL.getCode()).msg(CommonEnum.FAIL.getMsg()).build();
    }

    public static <T> R<T> fail(Integer code, String msg) {
        return R.<T>builder().code(code).msg(msg).build();
    }
}
