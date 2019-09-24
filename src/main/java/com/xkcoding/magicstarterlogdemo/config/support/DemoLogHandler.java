package com.xkcoding.magicstarterlogdemo.config.support;

import cn.hutool.json.JSONUtil;
import com.xkcoding.magic.log.model.CustomLogModel;
import com.xkcoding.magic.log.model.ErrorLogModel;
import com.xkcoding.magic.log.model.OperateLogModel;
import com.xkcoding.magic.log.support.LogHandler;
import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 日志执行逻辑
 * </p>
 *
 * @author yangkai.shen
 * @date Created in 2019/9/24 19:43
 */
@Slf4j
public class DemoLogHandler implements LogHandler {
    @Override
    public void handleOperateLog(OperateLogModel logModel) {
        log.info("【OperateLogModel】= {}", JSONUtil.toJsonStr(logModel));
    }

    @Override
    public void handleCustomLog(CustomLogModel logModel) {
        log.info("【CustomLogModel】= {}", JSONUtil.toJsonStr(logModel));
    }

    @Override
    public void handleErrorLog(ErrorLogModel logModel) {
        log.info("【ErrorLogModel】= {}", JSONUtil.toJsonStr(logModel));
    }
}
