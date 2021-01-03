package com.bayou.service.vango.data.mapper;

import com.bayou.service.vango.data.model.UserAddress;
import com.bayou.service.vango.data.model.UserAddressExample;
import org.springframework.stereotype.Repository;

/**
 * UserAddressDAO继承基类
 */
@Repository
public interface UserAddressDAO extends MyBatisBaseDao<UserAddress, Integer, UserAddressExample> {
}