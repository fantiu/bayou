package com.bayou.service.vango.service.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class TokenInfo implements Serializable{

    public static String AUTH_UID = "uid";

    public static String AUTH_MOBILE = "mobile";

    private Long uid;

    private String mobile;

    public TokenInfo() {

    }

    public TokenInfo(Map<String, String> info) {
        if (info == null) return;
        String uidStr = info.getOrDefault(AUTH_UID, null);
        if (uidStr != null) {
            uid = Long.parseLong(uidStr);
        }

        mobile = info.getOrDefault(AUTH_MOBILE, null);
    }

    public Map<String, String> getInfoMap() {
        Map<String, String> info = new HashMap<>();

        if (uid != null) info.put(AUTH_UID, uid.toString());
        if (mobile != null) info.put(AUTH_MOBILE, mobile);

        return info;
    }

    public Map<byte[], byte[]> getInfoBytesMap() {
        Map<byte[], byte[]> info = new HashMap<>();

        if (uid != null) info.put(AUTH_UID.getBytes(), uid.toString().getBytes());
        if (mobile != null) info.put(AUTH_MOBILE.getBytes(), mobile.getBytes());

        return info;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
