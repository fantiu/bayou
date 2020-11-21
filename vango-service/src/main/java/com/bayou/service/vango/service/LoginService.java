package com.bayou.service.vango.service;


import com.bayou.service.vango.common.BaseResponse;
import com.bayou.service.vango.service.request.LoginUserRequest;

public interface LoginService {

    BaseResponse createUser(LoginUserRequest request);
}
