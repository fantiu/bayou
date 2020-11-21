package com.bayou.service.vango.common.request;

import org.springframework.boot.logging.LogLevel;

import java.util.Random;

public class BaseRequest {

    private static final Random RAND = new Random();

    private LogLevel logLevel = LogLevel.INFO;

    private Long logId;

    private Boolean updateCache = false;

    public BaseRequest() {
        Long autoLogId = System.currentTimeMillis() % (1000L * 3600 * 24 * 7) * 1000 * 1000 + RAND.nextInt(1000 * 1000);
        setLogId(autoLogId);
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }

    public Boolean getUpdateCache() {
        return updateCache;
    }

    public void setUpdateCache(Boolean updateCache) {
        this.updateCache = updateCache;
    }

    public Boolean useCache() {
        return !getUpdateCache();
    }

    public Boolean updateCache() {
        return getUpdateCache();
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }
}
