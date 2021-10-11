package com.zaizai.demo.common.aspect;

import java.lang.annotation.*;

/**
 * @description
 * @author luojiyuan
 * @date 2021-09-17 11:30
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface WebLog {

    String description() default "";
}
