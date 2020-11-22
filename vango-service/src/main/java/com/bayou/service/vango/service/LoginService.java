package com.bayou.service.vango.service;


import com.bayou.service.vango.common.BaseResponse;
import com.bayou.service.vango.service.request.LoginRequest;
import com.bayou.service.vango.service.request.LoginUserRequest;
import com.bayou.service.vango.service.request.MobileCodeRequest;

public interface LoginService {

    BaseResponse createUser(LoginUserRequest request);

    BaseResponse requestMobileCode(MobileCodeRequest request);

    BaseResponse loginByMobile(LoginRequest request);
}
