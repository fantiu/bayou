package com.bayou.service.vango.data.mapper;

import com.bayou.service.vango.data.model.InputOrder;
import com.bayou.service.vango.data.model.InputOrderExample;
import org.springframework.stereotype.Repository;

/**
 * InputOrderDAO继承基类
 */
@Repository
public interface InputOrderDAO extends MyBatisBaseDao<InputOrder, Long, InputOrderExample> {
}