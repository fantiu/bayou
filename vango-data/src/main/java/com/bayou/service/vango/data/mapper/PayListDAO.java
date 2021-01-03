package com.bayou.service.vango.data.mapper;

import com.bayou.service.vango.data.model.PayList;
import com.bayou.service.vango.data.model.PayListExample;
import org.springframework.stereotype.Repository;

/**
 * PayListDAO继承基类
 */
@Repository
public interface PayListDAO extends MyBatisBaseDao<PayList, Integer, PayListExample> {
}