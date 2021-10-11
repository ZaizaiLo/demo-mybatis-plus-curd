package com.zaizai.demo.common.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @description
 * @author luojiyuan
 * @date 2021-09-17 11:46
 */
@Aspect
@Component
@Profile({"dev", "test"})
public class WebLogAspect {

    private final static Logger logger = LoggerFactory.getLogger(WebLogAspect.class);

    private static final String LINE_SEPARATOR = System.lineSeparator();
}
