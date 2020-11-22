package com.bayou.service.vango.start.web;

import com.bayou.service.vango.common.BaseResponse;
import com.bayou.service.vango.common.exceptions.VangoErrorCode;
import com.bayou.service.vango.service.LoginService;
import com.bayou.service.vango.service.request.LoginRequest;
import com.bayou.service.vango.service.request.MobileCodeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.validation.Valid;

@Controller
@RequestMapping(value = "/api/passport")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private LoginService loginService;

    @ResponseBody
    @RequestMapping(value = "/mobile/code/request", method = {RequestMethod.GET, RequestMethod.POST})
    public BaseResponse requestMobileCodeV3(@Valid @RequestBody MobileCodeRequest request, BindingResult bindingResult) {
        logger.info("request mobile code v3 {}", request);

        return loginService.requestMobileCode(request);
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public BaseResponse login(@Valid @RequestBody LoginRequest request, BindingResult bindingResult) {
        logger.info("login user {}", request);
        return loginService.loginByMobile(request);
    }
}
