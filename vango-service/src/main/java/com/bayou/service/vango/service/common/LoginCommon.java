package com.bayou.service.vango.service.common;

import com.bayou.service.vango.data.model.Users;
import com.bayou.service.vango.service.vo.LoginObjHolder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class LoginCommon {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Transactional
    public LoginObjHolder createUser(String mobile, String ip) {
        try {
            Users users = new Users();

            Long uid = 0L; //userMapper.insert(mobile, ip);

            /*users.setUid(uid);
            users.setCreatedIp(ip);
            users.setNickname(mobile.replace(mobile.substring(3, 7), "****"));
            users.setAvatar("");
            users.setGender(0);*/

            LoginObjHolder loginObjHolder = new LoginObjHolder();

            return loginObjHolder;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
