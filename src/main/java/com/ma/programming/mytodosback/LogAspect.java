package com.ma.programming.mytodosback;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    private final static Logger logger = LoggerFactory.getLogger(TodoController.class);

    @Around("@annotation(org.springframework.cloud.sleuth.annotation.NewSpan) && execution(public * *(..))")
    public Object log(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        logger.info("Method Called");
        Object value;

        try {
            value = proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throw throwable;
        } finally {
        }

        return value;
    }
}
