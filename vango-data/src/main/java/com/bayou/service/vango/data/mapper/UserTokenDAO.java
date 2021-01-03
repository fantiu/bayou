package com.bayou.service.vango.data.mapper;

import com.bayou.service.vango.data.model.UserToken;
import com.bayou.service.vango.data.model.UserTokenExample;
import org.springframework.stereotype.Repository;

/**
 * UserTokenDAO继承基类
 */
@Repository
public interface UserTokenDAO extends MyBatisBaseDao<UserToken, Long, UserTokenExample> {
}