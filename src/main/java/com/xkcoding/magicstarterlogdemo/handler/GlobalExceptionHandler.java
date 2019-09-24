package com.xkcoding.magicstarterlogdemo.handler;

import com.xkcoding.magic.core.tool.exception.ServiceException;
import com.xkcoding.magic.log.support.publisher.LogEventPublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * <p>
 * 异常拦截
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/9/19 15:48
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ServiceException.class)
    public String handlerAuthorizationException(ServiceException ex) {
        log.error("【拦截异常】", ex);
        LogEventPublisher.publishErrorLogEvent(ex);
        return ex.getMessage();
    }
}
