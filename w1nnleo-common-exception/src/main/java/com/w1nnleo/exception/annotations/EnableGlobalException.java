package com.w1nnleo.exception.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.context.annotation.Import;
import com.w1nnleo.exception.config.GlobalCustomConfiguration;

/**
 * @Author: w1nnleo
 * @date: 2023/2/15
 * @Description:
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({ GlobalCustomConfiguration.class })
public @interface EnableGlobalException {

}
