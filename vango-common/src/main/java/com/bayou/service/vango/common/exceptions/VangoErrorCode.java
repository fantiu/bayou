package com.bayou.service.vango.common.exceptions;

public enum VangoErrorCode {
    API_NOT_USED(99999, "接口不在使用"),
    SESSION_EXPIRED(40001, "非法会话或会话已过期"),
    REQUEST_PARAMS_ERROR(40003, "错误的请求参数"),
    WEIXIN_LOGIN_FAILED(40004, "微信登录失败"),
    MOBILE_CODE_INCORRECT(40006, "手机登录验证码错误"),
    QQ_LOGIN_FAILED(40007, "QQ登录失败"),
    WEIBO_LOGIN_FAILED(40008, "微博登录失败"),
    USER_DISABLED(40009, "用户已被禁用"),
    SMS_LOGIN_CODE_ERROR(40012, "验证码位数错误"),
    REQUEST_MOBILE_CODE_ERROR(40013, "验证码请求错误"),
    MOBILE_CODE_TTL_LIMIT(40015, "验证码重复请求"),
    MOBILE_CODE_TIMES_LIMIT(40016, "验证码超出当天限制"),
    REQUEST_CALL_CAPTCHA_SERVICE(40017, "请求图片验证码"),
    VERIFY_CAPTCHA_ERROR(40018, "图片验证错误"),
    LOGIN_CHANNAL_BANNED(40020, "登录渠道受限"),
    OPEN_APP_NOT_FOUND(40100, "暂未开通该开放平台"),
    USER_NOT_EXISTS(43001, "用户不存在"),
    USER_ADDRESS_NOT_EXISTS(43002, "地址错误"),
    ADDRESS_EXISTS(43010, "该地址已存在"),
    REGION_NOT_FOUND(43011, "对不起，该地区无法导入"),
    USER_IDCARD_INVALID(43004, "身份证号不存在"),
    OPEN_USER_CREATE_FAIL(43012, "创建用户失败"),
    ADDRESS_CREATE_ERROR(43016, "创建地址失败"),
    ADDRESS_BEYOND_LIMIT(43017, "地址数量超出限制"),
    APP_FEEDBACK_CREATE_FAIL(43018, "意见反馈创建失败"),
    APP_FEEDBACK_BEYOND_LIMIT(43019,"提交超过次数限制"),
    LOGIN_EXCEED_LIMIT(43020,"登陆超过频率限制"),
    RPC_QUERY_FAIL(43501,"rpc调用失败"),
    TOKEN_CREATE_FAIL(43502,"创建用户令牌失败"),
    TOKEN_RENEW_FAIL(43503,"刷新用户令牌失败"),
    GET_UNIONID_FAIL(43504,"用户未注册");

    private int code;
    private String msg;

    VangoErrorCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
