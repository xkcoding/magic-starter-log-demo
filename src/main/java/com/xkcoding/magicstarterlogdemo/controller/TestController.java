package com.xkcoding.magicstarterlogdemo.controller;

import com.xkcoding.magic.core.tool.api.R;
import com.xkcoding.magic.core.tool.exception.ServiceException;
import com.xkcoding.magic.log.annotation.OperateLog;
import com.xkcoding.magic.log.support.logger.MagicLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 测试
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/9/24 19:28
 */
@RestController
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class TestController {
    private final MagicLogger magicLogger;

    @OperateLog("测试请求")
    @GetMapping("test1")
    public R test(String param, boolean hasException) {
        magicLogger.info("测试模块", "xxxxx 在测试。。。。");
        if (hasException) {
            throw new ServiceException("发生异常");
        }
        return R.message(param);
    }
}
