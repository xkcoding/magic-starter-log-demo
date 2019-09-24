# magic-starter-log-demo

> 演示日志模块的使用

## 使用方法

### 1. 三种日志如何触发

- 操作日志

> 在需要记录操作日志的方法上添加注解

```java
@OperateLog("操作日志内容")
```

- 自定义日志

```java
@Autowired
private MagicLogger magicLogger;

magicLogger.warn("日志前缀", "日志内容");
magicLogger.debug("日志前缀", "日志内容");
magicLogger.info("日志前缀", "日志内容");
magicLogger.error("日志前缀", "日志内容");
```

- 错误日志

```java
LogEventPublisher.publishErrorLogEvent(exception);
```

### 2. 三种日志如何处理

```java
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
```

### 3. web请求/响应日志

```yaml
magic:
  log:
    request:
      enabled: true
```