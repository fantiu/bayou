package com.bayou.service.vango.data.mapper;

import com.bayou.service.vango.data.model.UserRegion;
import com.bayou.service.vango.data.model.UserRegionExample;
import org.springframework.stereotype.Repository;

/**
 * UserRegionDAO继承基类
 */
@Repository
public interface UserRegionDAO extends MyBatisBaseDao<UserRegion, Integer, UserRegionExample> {
}