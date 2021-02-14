package com.bayou.service.vango.service.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SmsConfig {

    // @Value("${vango.sms.verification.code.ttl}")
    private Integer ttl;

    // @Value("${vango.sms.verification.code.interval}")
    private Integer interval;

    // @Value("${vango.sms.verification.code.sign}")
    private String sign;

    // @Value("${vango.sms.verification.code.times}")
    private Integer times;

    public Integer getTtl() {
        return ttl != null ? ttl : 300;
    }

    public Integer getInterval() {
        return interval != null ? interval : 60;
    }

    public String getSign() {
        return sign != null ? sign : "";
    }

    public Integer getTimes() { return times != null ? times : 2; }
}
