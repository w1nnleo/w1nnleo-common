package com.w1nnleo.exception.handler;

import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.w1nnleo.base.entity.R;
import com.w1nnleo.base.enums.CommonEnum;
import com.w1nnleo.exception.constant.Constant;
import com.w1nnleo.exception.entity.BusinessException;

/**
 * @Author: w1nnleo
 * @date: 2023/2/15
 * @Description:
 */

@RestControllerAdvice
public class GlobalCustomAdvice {

    @ExceptionHandler(BusinessException.class)
    public R<?> handler(BusinessException e) {
        String[] split = e.getMessage().split(Constant.COMMA);
        return R.fail(Integer.valueOf(split[0]), split[1]);
    }

    @ExceptionHandler(Exception.class)
    public R<?> handler(Exception e) {
        e.printStackTrace();
        return R.fail(CommonEnum.FAIL.getCode(), CommonEnum.FAIL.getMsg());
    }

    @ExceptionHandler(BindException.class)
    public R<?> bindExceptionHandler(BindException e) {
        e.printStackTrace();
        FieldError error = e.getFieldError();
        return R.fail(CommonEnum.FAIL.getCode(), error.getDefaultMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R<?> exceptionHandler(MethodArgumentNotValidException e) {
        e.printStackTrace();
        FieldError error = e.getBindingResult().getFieldError();
        return R.fail(CommonEnum.FAIL.getCode(), error.getDefaultMessage());
    }

}
