package com.w1nnleo.exception.handler;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RestControllerAdvice
public class GlobalCustomAdvice {

    @ExceptionHandler(BusinessException.class)
    public R<?> handler(BusinessException e) {
        log.error("BusinessException is error:[{}]",e.getMessage(),e);
        String[] split = e.getMessage().split(Constant.COMMA);
        return R.fail(Integer.valueOf(split[0]), split[1]);
    }

    @ExceptionHandler(Exception.class)
    public R<?> handler(Exception e) {
        log.error("Exception is error:[{}]",e.getMessage(),e);
        return R.fail(CommonEnum.FAIL.getCode(), CommonEnum.FAIL.getMsg());
    }

    @ExceptionHandler(BindException.class)
    public R<?> bindExceptionHandler(BindException e) {
        log.error("BindException is error:[{}]",e.getMessage(),e);
        FieldError error = e.getFieldError();
        return R.fail(CommonEnum.FAIL.getCode(), error.getDefaultMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R<?> exceptionHandler(MethodArgumentNotValidException e) {
        log.error("MethodArgumentNotValidException is error:[{}]",e.getMessage(),e);
        FieldError error = e.getBindingResult().getFieldError();
        return R.fail(CommonEnum.FAIL.getCode(), error.getDefaultMessage());
    }

}
