package com.bayou.service.vango.data.mapper;

import com.bayou.service.vango.data.model.UserDevice;
import com.bayou.service.vango.data.model.UserDeviceExample;
import org.springframework.stereotype.Repository;

/**
 * UserDeviceDAO继承基类
 */
@Repository
public interface UserDeviceDAO extends MyBatisBaseDao<UserDevice, Long, UserDeviceExample> {
}