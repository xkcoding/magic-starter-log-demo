package com.xkcoding.magicstarterlogdemo.config;

import com.xkcoding.magic.log.support.LogHandler;
import com.xkcoding.magicstarterlogdemo.config.support.DemoLogHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 日志配置类
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/9/24 19:43
 */
@Configuration
public class LogConfig {
    // @Bean
    public LogHandler logHandler() {
        return new DemoLogHandler();
    }
}
