package com.bayou.service.vango.service.impl;



import com.bayou.service.vango.service.model.TokenInfo;
import com.bayou.service.vango.service.model.UserRedisModel;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class Auth {
    private static Logger logger = LoggerFactory.getLogger(Auth.class);

    public static String TOKEN_REGEX = "^[a-f0-9]{40}$";
    public static Pattern TOKEN_REGEX_PATTERN = Pattern.compile(TOKEN_REGEX);

    public static final long DEFAULT_DB_EXPIRE_TIME = 1296000L;

    private final RedisTemplate redisTemplate;

    private String accessToken;
    private TokenInfo tokenInfo;

    public Auth(RedisTemplate redisTemplate, String token) {
        this.redisTemplate = redisTemplate;
        accessToken = token;
        initStorage();
    }

    public boolean check() {
        if (!isValidToken(accessToken)) return false;
        return tokenInfo != null;
    }

    /**
     * remove old data and set with new data
     * @param tokenInfo {@link tokenInfo}
     * @param ttl
     */
    public void hmset(TokenInfo tokenInfo, int ttl) {
        if (accessToken == null || tokenInfo == null) return;

        String key = getTokenKey();

        Map<byte[], byte[]> info = tokenInfo.getInfoBytesMap();
        if (info.size() < 1) {
            logger.warn("info by token is empty {}", accessToken);
            return;
        }

        redisTemplate.executePipelined((RedisCallback) jedis -> {

            try {
                jedis.del(redisTemplate.getKeySerializer().serialize(key));
                jedis.hMSet(redisTemplate.getKeySerializer().serialize(key), info);

                if (ttl > 0) {
                    jedis.expire(redisTemplate.getKeySerializer().serialize(key), ttl);
                }
            } finally {

            }
            return null;
        });

        this.tokenInfo = tokenInfo;
    }

    public TokenInfo getInfoByToken() {
        return tokenInfo;
    }

    /**
     * add key, it just follow old API, try NOT to use it
     * @param key {@link tokenInfo}
     * @param value
     */
    public void add(String key, String value) {
        if (accessToken == null) return;
        if (!setInfo(key, value)) return;
        hmset(tokenInfo, 0);
    }

    public void forget(String key) {
        if (accessToken == null) return;
        if (!setInfo(key, null)) return;
        hmset(tokenInfo, 0);
    }

    private boolean setInfo(String key, String value) {
        if (tokenInfo.AUTH_UID.equals(key)) {
            tokenInfo.setUid(value != null ? Long.parseLong(value) : null);
        } else if (tokenInfo.AUTH_MOBILE.equals(key)) {
            tokenInfo.setMobile(value);
        } else {
            return false;
        }
        return true;
    }

    public Boolean renew(int tokenTtl) {
        if (accessToken == null || tokenInfo == null) return false;

        String key = getTokenKey();

        Long ttl = redisTemplate.getExpire(key, TimeUnit.SECONDS);
        if (ttl == null || ttl == -2) {
            logger.warn("token is expired {}", accessToken);
            return false;
        }
        // 针对无过期时间,设为默认过期时间
        if (ttl == -1) {
            redisTemplate.expire(key, tokenTtl, TimeUnit.SECONDS);
            return true;
        }
        // 有过期时间,且离过期还有一半时间
        double leftDays = Math.floor(ttl / 86400);
        int expireBench = tokenTtl / 86400 / 2;
        if (Math.floor(tokenTtl / 86400) - leftDays > expireBench) {
            redisTemplate.expire(key, tokenTtl, TimeUnit.SECONDS);
            return true;
        }
        return false;
    }

    public String setToken() {
        accessToken = generateToken();
        return accessToken;
    }

    public String getToken() {
        return accessToken;
    }

    public void destroy() {
        if (accessToken != null) {
            redisTemplate.delete(getTokenKey());
        }

        accessToken = null;
        tokenInfo = null;
    }

    protected void initStorage() {
        if (accessToken == null) return;

        Map<String, String> info = null;
        String key = getTokenKey();
        redisTemplate.executePipelined((RedisCallback) jedis -> {
            List<byte[]> infoList = jedis.hMGet(key.getBytes());

            for (int i = 0; i < infoList.size(); i+=2) {
                info.put(new String(infoList.get(i)), new String(infoList.get(i+1)));
            }

            return null;
        });

        if (info == null || info.size() < 1) return;
        tokenInfo = new TokenInfo(info);
    }

    private String getTokenKey() {
        return UserRedisModel.AUTH_ACCESS_TOKEN + accessToken;
    }

    protected boolean isValidToken(String token) {
        return token != null && TOKEN_REGEX_PATTERN.matcher(token).find();
    }

    protected String generateToken() {
        String uuid = UUID.randomUUID().toString();
        return DigestUtils.sha1Hex(uuid + RandomStringUtils.random(25) + System.currentTimeMillis());
    }


}
