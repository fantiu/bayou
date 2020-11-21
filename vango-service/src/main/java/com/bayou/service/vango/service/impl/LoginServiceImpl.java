package com.bayou.service.vango.service.impl;

import com.bayou.service.vango.common.BaseResponse;
import com.bayou.service.vango.data.mapper.UserMapper;
import com.bayou.service.vango.data.model.Users;
import com.bayou.service.vango.service.LoginService;
import com.bayou.service.vango.service.common.LoginCommon;
import com.bayou.service.vango.service.request.LoginUserRequest;
import com.bayou.service.vango.service.vo.LoginObjHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class LoginServiceImpl implements LoginService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private LoginCommon loginCommon;

    @Override
    public BaseResponse createUser(LoginUserRequest request) {
        String mobile = request.getMobile();
        String ip = request.getIp();
        LoginObjHolder loginObjHolder = loginCommon.createUser(mobile, ip);



        return BaseResponse.success(loginObjHolder);
    }
}
