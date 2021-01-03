package com.bayou.service.vango.data.mapper;

import com.bayou.service.vango.data.model.UserInfo;
import com.bayou.service.vango.data.model.UserInfoExample;
import org.springframework.stereotype.Repository;

/**
 * UserInfoDAO继承基类
 */
@Repository
public interface UserInfoDAO extends MyBatisBaseDao<UserInfo, Integer, UserInfoExample> {
}