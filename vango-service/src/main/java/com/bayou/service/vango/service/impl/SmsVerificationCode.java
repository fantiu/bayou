package com.bayou.service.vango.service.impl;

import com.bayou.service.vango.service.config.SmsConfig;
import com.bayou.service.vango.service.model.UserRedisModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class SmsVerificationCode {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private static final String VERIFY_MSG = "您的验证码是%d。请于5分钟内完成验证，若非本人操作，请忽略本短信。";

    @Autowired
    private SmsConfig config;

    @Autowired
    private RedisTemplate redisTemplate;

    public String send(String mobile) {
        String key = UserRedisModel.SMS_VERIFY_CODE + mobile;

        Long ttl = redisTemplate.getExpire(key, TimeUnit.SECONDS);
        if (ttl > 0 && (config.getTtl()-ttl < config.getInterval())) {
            return null;
        }

        Integer code = generateCode();
        String msg = String.format(VERIFY_MSG, code);
        msg = config.getSign() + msg;

        redisTemplate.opsForValue().set(key, code.toString(), config.getTtl(), TimeUnit.SECONDS);
        return msg;
    }

    public Boolean verify(String mobile, String code) {

        String key = UserRedisModel.SMS_VERIFY_CODE + mobile;

        String vCode = redisTemplate.opsForValue().get(key).toString();

        if (vCode == null) {
            logger.warn("mobile code is null {}", mobile);
            return false;
        }

        if (vCode.equals(code)) {
            redisTemplate.delete(key);
            return true;
        }

        logger.warn("mobile code is wrong {}, {}", vCode, code);
        return false;
    }

    private Integer generateCode() {
        return (int) (Math.random() * 888889 + 111111);
    }

    public Boolean enable(String mobile) {
        String key = UserRedisModel.SMS_VERIFY_TIMES + mobile;

        Long ttl = redisTemplate.getExpire(key, TimeUnit.SECONDS);

        if (ttl > 0) {
            Integer times = Integer.parseInt(redisTemplate.opsForValue().get(key).toString());
            if (times >= config.getTimes()) {
                return false;
            }
        }
        return true;
    }

    public void updateTimes(String mobile) {
        String key = UserRedisModel.SMS_VERIFY_TIMES + mobile;
        redisTemplate.opsForValue().increment(key);
        Long ttl = redisTemplate.getExpire(key, TimeUnit.SECONDS);
        if (ttl < 0) {
            redisTemplate.expire(key, 86400, TimeUnit.SECONDS);
        }
    }
}
