package com.bayou.service.vango.service.impl;

import com.bayou.service.vango.common.BaseResponse;
import com.bayou.service.vango.common.exceptions.VangoErrorCode;
import com.bayou.service.vango.data.model.Users;
import com.bayou.service.vango.service.LoginService;
import com.bayou.service.vango.service.common.LoginCommon;
import com.bayou.service.vango.service.model.TokenInfo;
import com.bayou.service.vango.service.request.LoginRequest;
import com.bayou.service.vango.service.request.LoginUserRequest;
import com.bayou.service.vango.service.request.MobileCodeRequest;
import com.bayou.service.vango.service.response.LoginByMobileResponse;
import com.bayou.service.vango.service.vo.LoginObjHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class LoginServiceImpl implements LoginService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private static final Integer isVerified = 1;

    @Autowired
    private LoginCommon loginCommon;

    @Autowired
    private SmsVerificationCode smsVerificationCode;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public BaseResponse createUser(LoginUserRequest request) {
        String mobile = request.getMobile();
        String ip = request.getIp();
        LoginObjHolder loginObjHolder = loginCommon.createUser(mobile, ip);

        return BaseResponse.success(loginObjHolder);
    }

    @Override
    public BaseResponse requestMobileCode(MobileCodeRequest request) {
        String mobile = request.getMobile();
        Integer verified = request.getVerified();

        if (mobile == null || mobile.trim().length() != 11) {
            return BaseResponse.error(VangoErrorCode.REQUEST_MOBILE_CODE_ERROR);
        }

        if (!isVerified.equals(verified) && !smsVerificationCode.enable(mobile.trim())) {
            return BaseResponse.error(VangoErrorCode.REQUEST_CALL_CAPTCHA_SERVICE);
        }

        String msg  = smsVerificationCode.send(mobile.trim());

        if (msg == null) {
            return BaseResponse.error(VangoErrorCode.MOBILE_CODE_TTL_LIMIT);
        }

        smsVerificationCode.updateTimes(mobile.trim());

        return BaseResponse.success(msg);
    }

    @Override
    public BaseResponse loginByMobile(LoginRequest request) {
        String code = request.getCode();
        String mobile = request.getMobile();

        if (code == null || code.length() != 6) {
            return BaseResponse.error(VangoErrorCode.SMS_LOGIN_CODE_ERROR);
        }
        if (mobile == null || mobile.length() != 11) {
            return BaseResponse.error(VangoErrorCode.REQUEST_PARAMS_ERROR);
        }

        if (!smsVerificationCode.verify(mobile, code)) {
            return BaseResponse.error(VangoErrorCode.MOBILE_CODE_INCORRECT);
        }

        Users userInfo= null;

        try {
            LoginObjHolder loginObjHolder = null;
            try{
                loginObjHolder = loginCommon.createUser(mobile, request.getIp());
            }catch(Exception e){
                return BaseResponse.error(VangoErrorCode.RPC_QUERY_FAIL);
            }
            if (loginObjHolder != null) {
                userInfo = new Users();
                userInfo.setUid(loginObjHolder.getUid());
            }
        } catch (Exception e) {
            logger.warn("failed to create mobile user {}", e.getMessage());
            return BaseResponse.error(VangoErrorCode.OPEN_USER_CREATE_FAIL);
        }


        if (userInfo == null) {
            return BaseResponse.error(VangoErrorCode.REQUEST_PARAMS_ERROR);
        }

        Auth auth = new Auth(redisTemplate, null);
        auth.setToken();

        Long uid = userInfo.getUid();

        TokenInfo tokenInfo = new TokenInfo();
        tokenInfo.setUid(uid);
        tokenInfo.setMobile(mobile);

        String accessToken = auth.getToken();

        // insert user_token
        /*if (saveUserToken(infoByToken, accessToken, false) <= 0) {
            loginStatus.setStatus(PassportErrorCode.TOKEN_CREATE_FAIL);
            return loginStatus;
        }*/

        auth.hmset(tokenInfo, 86400);

        LoginByMobileResponse result = new LoginByMobileResponse();
        result.setUid(uid);
        result.setAccessToken(accessToken);

        return BaseResponse.success(result);
    }
}
